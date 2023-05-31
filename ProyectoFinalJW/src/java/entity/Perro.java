package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity
@Table
@NamedQueries(@NamedQuery(name="Perro.getAll", query="SELECT e FROM Perro e"))
public class Perro implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int idPerro;
    @Column
    private String nombrePerro;
    @Column
    private String razaPerro;
    @Column
    private String edadPerro;
    @Column
    private char sexoPerro;

    public Perro(int idPerro, String nombrePerro, String razaPerro, String edadPerro, char sexoPerro) {
        this.idPerro = idPerro;
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.edadPerro = edadPerro;
        this.sexoPerro = sexoPerro;
    }
    
    public Perro() {
        
    }

    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(String edadPerro) {
        this.edadPerro = edadPerro;
    }

    public char getSexoPerro() {
        return sexoPerro;
    }

    public void setSexoPerro(char sexoPerro) {
        this.sexoPerro = sexoPerro;
    }
    
    
}
