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

    @ManyToOne
    @JoinColumn(name = "idObjeto", nullable = false)
    private Objeto objeto;

    @ManyToOne
    @JoinColumn(name = "idEstadoReporte", nullable = false)
    private EstadoReporte estadoreporte;
    public Reporte() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Reporte(int idReporte, String nombreReporte, String descripcionReporte, String fechaReporte, Objeto objeto, EstadoReporte estadoreporte) {
        this.idReporte = idReporte;
        this.nombreReporte = nombreReporte;
        this.descripcionReporte = descripcionReporte;
        this.fechaReporte = fechaReporte;
        this.objeto = objeto;
        this.estadoreporte = estadoreporte;
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
    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public EstadoReporte getEstadoreporte() {
        return estadoreporte;
    }

    public void setEstadoreporte(EstadoReporte estadoreporte) {
        this.estadoreporte = estadoreporte;
    }
}

