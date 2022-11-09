package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Objeto")
public class Objeto implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObjeto;
    @Column(name = "nombreObjeto", length = 100, nullable = false)
    private String nombreObjeto;
    @Column(name = "distancia", length = 20, nullable = false)
    private String distancia;
    @Column(name = "distanciaLimite", length = 20, nullable = false)
    private String distanciaLimite;
    @Column(name = "ubicacion", length = 100, nullable = false)
    private String ubicacion;
    @Column(name = "fechaRegistrado", length = 20, nullable = false)
    private String fechaRegistrado;

    public Objeto() {
    }

    public Objeto(int idObjeto, String nombreObjeto, String distancia, String distanciaLimite, String ubicacion, String fechaRegistrado) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.distancia = distancia;
        this.distanciaLimite = distanciaLimite;
        this.ubicacion = ubicacion;
        this.fechaRegistrado = fechaRegistrado;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDistanciaLimite() {
        return distanciaLimite;
    }

    public void setDistanciaLimite(String distanciaLimite) {
        this.distanciaLimite = distanciaLimite;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaRegistrado() {
        return fechaRegistrado;
    }

    public void setFechaRegistrado(String fechaRegistrado) {
        this.fechaRegistrado = fechaRegistrado;
    }
}
