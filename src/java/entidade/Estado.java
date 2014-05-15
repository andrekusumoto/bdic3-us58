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
@Table(name = "ESTADO")
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e"),
    @NamedQuery(name = "Estado.findByEstCodigo", query = "SELECT e FROM Estado e WHERE e.estCodigo = :estCodigo"),
    @NamedQuery(name = "Estado.findByEstDescricao", query = "SELECT e FROM Estado e WHERE e.estDescricao = :estDescricao")})
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "est_codigo", nullable = false)
    private Integer estCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "est_descricao", nullable = false, length = 256)
    private String estDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estCodigo")
    private Collection<Cidade> cidadeCollection;

    public Estado() {
    }

    public Estado(Integer estCodigo) {
        this.estCodigo = estCodigo;
    }

    public Estado(Integer estCodigo, String estDescricao) {
        this.estCodigo = estCodigo;
        this.estDescricao = estDescricao;
    }

    public Integer getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(Integer estCodigo) {
        this.estCodigo = estCodigo;
    }

    public String getEstDescricao() {
        return estDescricao;
    }

    public void setEstDescricao(String estDescricao) {
        this.estDescricao = estDescricao;
    }

    public Collection<Cidade> getCidadeCollection() {
        return cidadeCollection;
    }

    public void setCidadeCollection(Collection<Cidade> cidadeCollection) {
        this.cidadeCollection = cidadeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estCodigo != null ? estCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.estCodigo == null && other.estCodigo != null) || (this.estCodigo != null && !this.estCodigo.equals(other.estCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Estado[ estCodigo=" + estCodigo + " ]";
    }
    
}
