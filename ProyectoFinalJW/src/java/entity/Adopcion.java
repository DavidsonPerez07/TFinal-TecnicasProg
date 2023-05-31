package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
@NamedQueries(@NamedQuery(name="Adopcion.getAll", query="SELECT e FROM Adopcion e"))
public class Adopcion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int idAdopcion;
    @Column
    private LocalDate fechaAdopcion;
    @Column
    private String nombreAdoptante;
    @Column
    private String documentoAdoptante;
    @Column
    private int edadAdoptante;
    @Column
    private String emailAdoptante;
    @Column
    private String telefonoAdoptante;
    @Column
    @OneToOne
    @JoinColumn(name = "id_perro")
    private Perro perro;

    public Adopcion(int idAdopcion, LocalDate fechaAdopcion, String nombreAdoptante, String documentoAdoptante, int edadAdoptante, String emailAdoptante, String telefonoAdoptante, Perro perro) {
        this.idAdopcion = idAdopcion;
        this.fechaAdopcion = fechaAdopcion;
        this.nombreAdoptante = nombreAdoptante;
        this.documentoAdoptante = documentoAdoptante;
        this.edadAdoptante = edadAdoptante;
        this.emailAdoptante = emailAdoptante;
        this.telefonoAdoptante = telefonoAdoptante;
        this.perro = perro;
    }

    public int getIdAdopcion() {
        return idAdopcion;
    }

    public void setIdAdopcion(int idAdopcion) {
        this.idAdopcion = idAdopcion;
    }

    public LocalDate getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(LocalDate fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getNombreAdoptante() {
        return nombreAdoptante;
    }

    public void setNombreAdoptante(String nombreAdoptante) {
        this.nombreAdoptante = nombreAdoptante;
    }

    public String getDocumentoAdoptante() {
        return documentoAdoptante;
    }

    public void setDocumentoAdoptante(String documentoAdoptante) {
        this.documentoAdoptante = documentoAdoptante;
    }

    public int getEdadAdoptante() {
        return edadAdoptante;
    }

    public void setEdadAdoptante(int edadAdoptante) {
        this.edadAdoptante = edadAdoptante;
    }

    public String getEmailAdoptante() {
        return emailAdoptante;
    }

    public void setEmailAdoptante(String emailAdoptante) {
        this.emailAdoptante = emailAdoptante;
    }

    public String getTelefonoAdoptante() {
        return telefonoAdoptante;
    }

    public void setTelefonoAdoptante(String telefonoAdoptante) {
        this.telefonoAdoptante = telefonoAdoptante;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
}
