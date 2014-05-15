/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kusumotoayk
 */
@Entity
@Table(name = "CARTAODECREDITO")
@NamedQueries({
    @NamedQuery(name = "Cartaodecredito.findAll", query = "SELECT c FROM Cartaodecredito c"),
    @NamedQuery(name = "Cartaodecredito.findByCdcNumero", query = "SELECT c FROM Cartaodecredito c WHERE c.cdcNumero = :cdcNumero"),
    @NamedQuery(name = "Cartaodecredito.orderByCdcNumero", query = "SELECT c FROM Cartaodecredito c order by c.cdcNumero"),
    @NamedQuery(name = "Cartaodecredito.findByCdcCodigoseguranca", query = "SELECT c FROM Cartaodecredito c WHERE c.cdcCodigoseguranca = :cdcCodigoseguranca"),
    @NamedQuery(name = "Cartaodecredito.findByCdcDatavalidade", query = "SELECT c FROM Cartaodecredito c WHERE c.cdcDatavalidade = :cdcDatavalidade"),
    @NamedQuery(name = "Cartaodecredito.orderByCdcNomenocartao", query = "SELECT c FROM Cartaodecredito c order by c.cdcNomenocartao"),
    @NamedQuery(name = "Cartaodecredito.findByCdcNomenocartao", query = "SELECT c FROM Cartaodecredito c WHERE c.cdcNomenocartao like CONCAT(:cdcNomenocartao, '%')")})
public class Cartaodecredito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cdc_numero", nullable = false)
    private Integer cdcNumero;
    @NotNull
    @Basic(optional = false)
    @Column(name = "cdc_codigoseguranca", nullable = false)
    private int cdcCodigoseguranca;
    @NotNull
    @Basic(optional = false)
    @Column(name = "cdc_datavalidade", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date cdcDatavalidade;
    @NotNull
    @Basic(optional = false)
    @Size(min = 0, max = 256)
    @Column(name = "cdc_nomenocartao", nullable = false, length = 256)
    private String cdcNomenocartao;
    @JoinColumn(name = "cli_cpf", referencedColumnName = "cli_cpf", nullable = false)
    @ManyToOne(optional = false)
    private Cliente cliCpf;
    @JoinColumn(name = "ope_codigo", referencedColumnName = "ope_codigo", nullable = false)
    @ManyToOne(optional = false)
    private Operadora opeCodigo;

    public Cartaodecredito() {
    }

    public Cartaodecredito(Integer cdcNumero) {
        this.cdcNumero = cdcNumero;
    }

    public Cartaodecredito(Integer cdcNumero, int cdcCodigoseguranca, Date cdcDatavalidade, String cdcNomenocartao) {
        this.cdcNumero = cdcNumero;
        this.cdcCodigoseguranca = cdcCodigoseguranca;
        this.cdcDatavalidade = cdcDatavalidade;
        this.cdcNomenocartao = cdcNomenocartao;
    }

    public Integer getCdcNumero() {
        return cdcNumero;
    }

    public void setCdcNumero(Integer cdcNumero) {
        this.cdcNumero = cdcNumero;
    }

    public int getCdcCodigoseguranca() {
        return cdcCodigoseguranca;
    }

    public void setCdcCodigoseguranca(int cdcCodigoseguranca) {
        this.cdcCodigoseguranca = cdcCodigoseguranca;
    }

    public Date getCdcDatavalidade() {
        return cdcDatavalidade;
    }

    public void setCdcDatavalidade(Date cdcDatavalidade) {
        this.cdcDatavalidade = cdcDatavalidade;
    }

    public String getCdcNomenocartao() {
        return cdcNomenocartao;
    }

    public void setCdcNomenocartao(String cdcNomenocartao) {
        this.cdcNomenocartao = cdcNomenocartao;
    }

    public Cliente getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(Cliente cliCpf) {
        this.cliCpf = cliCpf;
    }

    public Operadora getOpeCodigo() {
        return opeCodigo;
    }

    public void setOpeCodigo(Operadora opeCodigo) {
        this.opeCodigo = opeCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdcNumero != null ? cdcNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartaodecredito)) {
            return false;
        }
        Cartaodecredito other = (Cartaodecredito) object;
        if ((this.cdcNumero == null && other.cdcNumero != null) || (this.cdcNumero != null && !this.cdcNumero.equals(other.cdcNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Cartaodecredito[ cdcNumero=" + cdcNumero + " ]";
    }
    
}
