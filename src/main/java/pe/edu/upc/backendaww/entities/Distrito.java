package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Distrito")
public class Distrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;
    @Column(name = "nombreDistrito", length = 50, nullable = false)
    private String nombreDistrito;

    public Distrito() {
    }

    public Distrito(int idDistrito, String nombreDistrito) {
        this.idDistrito = idDistrito;
        this.nombreDistrito = nombreDistrito;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
}

