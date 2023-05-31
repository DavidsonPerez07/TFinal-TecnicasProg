package dao;

import entity.Adopcion;
import jakarta.ejb.Local;
import java.util.List;

@Local
public interface AdopcionDaoLocal {
    public void addAdopcion(Adopcion adopcion);

    public void editAdopcion(Adopcion adopcion);

    public void deleteAdopcion(int idAdopcion);

    public Adopcion getAdopcion(int idAdopcion);

    public List<Adopcion> getAllAdopciones();
}
