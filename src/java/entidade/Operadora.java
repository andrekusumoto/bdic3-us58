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
@Table(name = "OPERADORA")
@NamedQueries({
    @NamedQuery(name = "Operadora.findAll", query = "SELECT o FROM Operadora o"),
    @NamedQuery(name = "Operadora.findByOpeCodigo", query = "SELECT o FROM Operadora o WHERE o.opeCodigo = :opeCodigo"),
    @NamedQuery(name = "Operadora.findByOpeDescricao", query = "SELECT o FROM Operadora o WHERE o.opeDescricao = :opeDescricao")})
public class Operadora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ope_codigo", nullable = false)
    private Integer opeCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ope_descricao", nullable = false, length = 256)
    private String opeDescricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "opeCodigo")
    private Collection<Cartaodecredito> cartaodecreditoCollection;

    public Operadora() {
    }

    public Operadora(Integer opeCodigo) {
        this.opeCodigo = opeCodigo;
    }

    public Operadora(Integer opeCodigo, String opeDescricao) {
        this.opeCodigo = opeCodigo;
        this.opeDescricao = opeDescricao;
    }

    public Integer getOpeCodigo() {
        return opeCodigo;
    }

    public void setOpeCodigo(Integer opeCodigo) {
        this.opeCodigo = opeCodigo;
    }

    public String getOpeDescricao() {
        return opeDescricao;
    }

    public void setOpeDescricao(String opeDescricao) {
        this.opeDescricao = opeDescricao;
    }

    public Collection<Cartaodecredito> getCartaodecreditoCollection() {
        return cartaodecreditoCollection;
    }

    public void setCartaodecreditoCollection(Collection<Cartaodecredito> cartaodecreditoCollection) {
        this.cartaodecreditoCollection = cartaodecreditoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opeCodigo != null ? opeCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operadora)) {
            return false;
        }
        Operadora other = (Operadora) object;
        if ((this.opeCodigo == null && other.opeCodigo != null) || (this.opeCodigo != null && !this.opeCodigo.equals(other.opeCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Operadora[ opeCodigo=" + opeCodigo + " ]";
    }
    
}
