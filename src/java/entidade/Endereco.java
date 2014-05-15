/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author kusumotoayk
 */
@Entity
@Table(name = "ENDERECO")
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
    @NamedQuery(name = "Endereco.findByEndCodigo", query = "SELECT e FROM Endereco e WHERE e.endCodigo = :endCodigo"),
    @NamedQuery(name = "Endereco.findByEndLogradouro", query = "SELECT e FROM Endereco e WHERE e.endLogradouro = :endLogradouro"),
    @NamedQuery(name = "Endereco.findByEndNumero", query = "SELECT e FROM Endereco e WHERE e.endNumero = :endNumero"),
    @NamedQuery(name = "Endereco.findByEndBairro", query = "SELECT e FROM Endereco e WHERE e.endBairro = :endBairro"),
    @NamedQuery(name = "Endereco.findByEndComplemento", query = "SELECT e FROM Endereco e WHERE e.endComplemento = :endComplemento"),
    @NamedQuery(name = "Endereco.findByEndCep", query = "SELECT e FROM Endereco e WHERE e.endCep = :endCep"),
    @NamedQuery(name = "Endereco.findByEndLatitude", query = "SELECT e FROM Endereco e WHERE e.endLatitude = :endLatitude"),
    @NamedQuery(name = "Endereco.findByEndLongitude", query = "SELECT e FROM Endereco e WHERE e.endLongitude = :endLongitude")})
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "end_codigo", nullable = false)
    private Integer endCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 512)
    @Column(name = "end_logradouro", nullable = false, length = 512)
    private String endLogradouro;
    @Column(name = "end_numero")
    private Integer endNumero;
    @Size(max = 256)
    @Column(name = "end_bairro", length = 256)
    private String endBairro;
    @Size(max = 256)
    @Column(name = "end_complemento", length = 256)
    private String endComplemento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "end_cep", nullable = false, length = 9)
    private String endCep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "end_latitude", nullable = false, length = 256)
    private String endLatitude;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "end_longitude", nullable = false, length = 256)
    private String endLongitude;
    @JoinColumn(name = "cid_codigo", referencedColumnName = "cid_codigo", nullable = false)
    @ManyToOne(optional = false)
    private Cidade cidCodigo;
    @JoinColumn(name = "cli_cpf", referencedColumnName = "cli_cpf", nullable = false)
    @ManyToOne(optional = false)
    private Cliente cliCpf;

    public Endereco() {
    }

    public Endereco(Integer endCodigo) {
        this.endCodigo = endCodigo;
    }

    public Endereco(Integer endCodigo, String endLogradouro, String endCep, String endLatitude, String endLongitude) {
        this.endCodigo = endCodigo;
        this.endLogradouro = endLogradouro;
        this.endCep = endCep;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
    }

    public Integer getEndCodigo() {
        return endCodigo;
    }

    public void setEndCodigo(Integer endCodigo) {
        this.endCodigo = endCodigo;
    }

    public String getEndLogradouro() {
        return endLogradouro;
    }

    public void setEndLogradouro(String endLogradouro) {
        this.endLogradouro = endLogradouro;
    }

    public Integer getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(Integer endNumero) {
        this.endNumero = endNumero;
    }

    public String getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }

    public String getEndComplemento() {
        return endComplemento;
    }

    public void setEndComplemento(String endComplemento) {
        this.endComplemento = endComplemento;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Cidade getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(Cidade cidCodigo) {
        this.cidCodigo = cidCodigo;
    }

    public Cliente getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(Cliente cliCpf) {
        this.cliCpf = cliCpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (endCodigo != null ? endCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.endCodigo == null && other.endCodigo != null) || (this.endCodigo != null && !this.endCodigo.equals(other.endCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Endereco[ endCodigo=" + endCodigo + " ]";
    }
    
}
