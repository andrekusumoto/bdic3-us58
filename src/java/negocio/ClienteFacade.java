/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidade.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author kusumotoayk
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> {
    @PersistenceContext(unitName = "jpawebrevPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }

    
    public List<Cliente> findByName(String name)
    {
        Query query = getEntityManager().createNamedQuery("Cliente.findByCliNome");
        query.setParameter("cliNome", name);
        return query.getResultList();
    }

    public List<Cliente> findByCpf(Integer cliCpf) {
        Query query = getEntityManager().createNamedQuery("Cliente.findByCliCpf");
        query.setParameter("cliCpf", cliCpf);
        return query.getResultList();
    }

    public List<Cliente> orderCpf() {
        Query query = getEntityManager().createNamedQuery("Cliente.orderByCliCpf");
        return query.getResultList();
    }

    public List<Cliente> orderNome() {
        Query query = getEntityManager().createNamedQuery("Cliente.orderByCliNome");
        return query.getResultList();
    }
    
    
}
