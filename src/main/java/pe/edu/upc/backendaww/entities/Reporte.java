package pe.edu.upc.backendaww.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Reporte")
public class Reporte implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReporte;
    @Column(name = "nombreReporte", length = 50, nullable = false)
    private String nombreReporte;
    @Column(name = "descripcionReporte", length = 50, nullable = false)
    private String descripcionReporte;
    @Column(name = "fechaReporte", length = 10, nullable = false)
    private String fechaReporte;

    public Reporte() {
    }

    public Reporte(int idReporte, String nombreReporte, String descripcionReporte, String fechaReporte) {
        this.idReporte = idReporte;
        this.nombreReporte = nombreReporte;
        this.descripcionReporte = descripcionReporte;
        this.fechaReporte = fechaReporte;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getDescripcionReporte() {
        return descripcionReporte;
    }

    public void setDescripcionReporte(String descripcionReporte) {
        this.descripcionReporte = descripcionReporte;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }
}

