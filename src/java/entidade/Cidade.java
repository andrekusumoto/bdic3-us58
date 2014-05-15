/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kusumotoayk
 */
@Entity
@Table(name = "CIDADE")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
    @NamedQuery(name = "Cidade.findByCidCodigo", query = "SELECT c FROM Cidade c WHERE c.cidCodigo = :cidCodigo"),
    @NamedQuery(name = "Cidade.findByCidDescricao", query = "SELECT c FROM Cidade c WHERE c.cidDescricao = :cidDescricao")})
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid_codigo", nullable = false)
    private Integer cidCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "cid_descricao", nullable = false, length = 256)
    private String cidDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidCodigo")
    private Collection<Endereco> enderecoCollection;
    @JoinColumn(name = "est_codigo", referencedColumnName = "est_codigo", nullable = false)
    @ManyToOne(optional = false)
    private Estado estCodigo;

    public Cidade() {
    }

    public Cidade(Integer cidCodigo) {
        this.cidCodigo = cidCodigo;
    }

    public Cidade(Integer cidCodigo, String cidDescricao) {
        this.cidCodigo = cidCodigo;
        this.cidDescricao = cidDescricao;
    }

    public Integer getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(Integer cidCodigo) {
        this.cidCodigo = cidCodigo;
    }

    public String getCidDescricao() {
        return cidDescricao;
    }

    public void setCidDescricao(String cidDescricao) {
        this.cidDescricao = cidDescricao;
    }

    public Collection<Endereco> getEnderecoCollection() {
        return enderecoCollection;
    }

    public void setEnderecoCollection(Collection<Endereco> enderecoCollection) {
        this.enderecoCollection = enderecoCollection;
    }

    public Estado getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(Estado estCodigo) {
        this.estCodigo = estCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cidCodigo != null ? cidCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.cidCodigo == null && other.cidCodigo != null) || (this.cidCodigo != null && !this.cidCodigo.equals(other.cidCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Cidade[ cidCodigo=" + cidCodigo + " ]";
    }
    
}
