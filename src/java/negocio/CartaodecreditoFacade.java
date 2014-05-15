/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidade.Cartaodecredito;
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
public class CartaodecreditoFacade extends AbstractFacade<Cartaodecredito> {
    @PersistenceContext(unitName = "jpawebrevPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CartaodecreditoFacade() {
        super(Cartaodecredito.class);
    }
    
    public List<Cartaodecredito> orderNumero()
    {
        Query query = getEntityManager().createNamedQuery("Cartaodecredito.orderByCdcNumero");
        return query.getResultList();
    }
    
    public List<Cartaodecredito> orderNome()
    {
        Query query = getEntityManager().createNamedQuery("Cartaodecredito.orderByCdcNomenocartao");
        return query.getResultList();
    }
    
    public List<Cartaodecredito> findByNomeNocartao(String name)
    {
        Query query = getEntityManager().createNamedQuery("Cartaodecredito.findByCdcNomenocartao");
        query.setParameter("cdcNomenocartao", name);
        return query.getResultList();
    }

    public List<Cartaodecredito> findByNumero(Integer cdcNumero) {
        Query query = getEntityManager().createNamedQuery("Cartaodecredito.findByCdcNumero");
        query.setParameter("cdcNumero", cdcNumero);
        return query.getResultList();
    }
    
}
