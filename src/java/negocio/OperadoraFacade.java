/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entidade.Operadora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kusumotoayk
 */
@Stateless
public class OperadoraFacade extends AbstractFacade<Operadora> {
    @PersistenceContext(unitName = "jpawebrevPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperadoraFacade() {
        super(Operadora.class);
    }
    
}
