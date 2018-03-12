/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author oswal
 */
@Stateless
public class BookHistoryFacade extends AbstractFacade<BookHistory> {

    @PersistenceContext(unitName = "LibraryASM-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookHistoryFacade() {
        super(BookHistory.class);
    }
    
    public List<BookHistory> findByCode(Book book) {
        String query = "SELECT b FROM BookHistory b WHERE b.code = :code";
        TypedQuery tq = em.createQuery(query, BookHistory.class);
        tq.setParameter("code", book);
        return tq.getResultList();
    }
}
