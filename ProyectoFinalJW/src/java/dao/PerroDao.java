package dao;

import entity.Perro;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PerroDao implements PerroDaoLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addPerro(Perro perro) {
        em.persist(perro);
    }

    @Override
    public void editPerro(Perro perro) {
        em.merge(perro);
    }

    @Override
    public void deletePerro(int idPerro) {
        em.remove(getPerro(idPerro));
    }

    @Override
    public Perro getPerro(int idPerro) {
        return em.find(Perro.class, idPerro);
    }

    @Override
    public List<Perro> getAllPerros() {
        return em.createNamedQuery("Perro.getAll").getResultList();
    }
}
