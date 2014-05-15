/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "CLIENTE")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCliCpf", query = "SELECT c FROM Cliente c WHERE c.cliCpf = :cliCpf"),
    @NamedQuery(name = "Cliente.orderByCliCpf", query = "SELECT c FROM Cliente c order by c.cliCpf"),
    @NamedQuery(name = "Cliente.orderByCliNome", query = "SELECT c FROM Cliente c order by c.cliNome"),
    @NamedQuery(name = "Cliente.findByCliNome", query = "SELECT c FROM Cliente c WHERE c.cliNome like CONCAT(:cliNome,'%')"),
    @NamedQuery(name = "Cliente.findByCliDatanascimento", query = "SELECT c FROM Cliente c WHERE c.cliDatanascimento = :cliDatanascimento"),
    @NamedQuery(name = "Cliente.findByCliEmail", query = "SELECT c FROM Cliente c WHERE c.cliEmail = :cliEmail"),
    @NamedQuery(name = "Cliente.findByCliSenha", query = "SELECT c FROM Cliente c WHERE c.cliSenha = :cliSenha")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cli_cpf", nullable = false)
    private Integer cliCpf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 256)
    @Column(name = "cli_nome", nullable = false, length = 256)
    private String cliNome;
    @Column(name = "cli_datanascimento")
    @Temporal(TemporalType.DATE)
    private Date cliDatanascimento;
    @Size(max = 256)
    @Column(name = "cli_email", length = 256)
    private String cliEmail;
    @Size(max = 256)
    @Column(name = "cli_senha", length = 256)
    private String cliSenha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliCpf")
    private Collection<Cartaodecredito> cartaodecreditoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliCpf")
    private Collection<Endereco> enderecoCollection;

    public Cliente() {
    }

    public Cliente(Integer cliCpf) {
        this.cliCpf = cliCpf;
    }

    public Cliente(Integer cliCpf, String cliNome) {
        this.cliCpf = cliCpf;
        this.cliNome = cliNome;
    }

    public Integer getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(Integer cliCpf) {
        this.cliCpf = cliCpf;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public Date getCliDatanascimento() {
        return cliDatanascimento;
    }

    public void setCliDatanascimento(Date cliDatanascimento) {
        this.cliDatanascimento = cliDatanascimento;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCliSenha() {
        return cliSenha;
    }

    public void setCliSenha(String cliSenha) {
        this.cliSenha = cliSenha;
    }

    public Collection<Cartaodecredito> getCartaodecreditoCollection() {
        return cartaodecreditoCollection;
    }

    public void setCartaodecreditoCollection(Collection<Cartaodecredito> cartaodecreditoCollection) {
        this.cartaodecreditoCollection = cartaodecreditoCollection;
    }

    public Collection<Endereco> getEnderecoCollection() {
        return enderecoCollection;
    }

    public void setEnderecoCollection(Collection<Endereco> enderecoCollection) {
        this.enderecoCollection = enderecoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCpf != null ? cliCpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCpf == null && other.cliCpf != null) || (this.cliCpf != null && !this.cliCpf.equals(other.cliCpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Cliente[ cliCpf=" + cliCpf + " ]";
    }
    
}
