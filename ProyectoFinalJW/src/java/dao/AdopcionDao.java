package dao;

import entity.Adopcion;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AdopcionDao implements AdopcionDaoLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addAdopcion(Adopcion adopcion) {
        em.persist(adopcion);
    }

    @Override
    public void editAdopcion(Adopcion adopcion) {
        em.merge(adopcion);
    }

    @Override
    public void deleteAdopcion(int idAdopcion) {
        em.remove(getAdopcion(idAdopcion));
    }

    @Override
    public Adopcion getAdopcion(int idAdopcion) {
        return em.find(Adopcion.class, idAdopcion);
    }

    @Override
    public List<Adopcion> getAllAdopciones() {
        return em.createNamedQuery("Adopcion.getAll").getResultList();
    }
}
