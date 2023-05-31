package dao;

import entity.Perro;
import jakarta.ejb.Local;
import java.util.List;

@Local
public interface PerroDaoLocal {
    
    public void addPerro(Perro perro);

    public void editPerro(Perro perro);

    public void deletePerro(int idPerro);

    public Perro getPerro(int idPerro);

    public List<Perro> getAllPerros();
}
