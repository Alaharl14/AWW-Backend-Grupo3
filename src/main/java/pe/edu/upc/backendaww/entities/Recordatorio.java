package pe.edu.upc.backendaww.entities;

import javax.persistence.*;

@Entity
@Table(name = "Recordatorio")
public class Recordatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecordatorio;
    @Column(name = "estadoRecordatorio",length = 50,nullable = false)
    private String estadoRecordatorio;

    public Recordatorio() {
    }

    public Recordatorio(int idRecordatorio, String estadoRecordatorio) {
        this.idRecordatorio = idRecordatorio;
        this.estadoRecordatorio = estadoRecordatorio;
    }

    public int getIdRecordatorio() {
        return idRecordatorio;
    }

    public void setIdRecordatorio(int idRecordatorio) {
        this.idRecordatorio = idRecordatorio;
    }

    public String getEstadoRecordatorio() {
        return estadoRecordatorio;
    }

    public void setEstadoRecordatorio(String estadoRecordatorio) {
        this.estadoRecordatorio = estadoRecordatorio;
    }
}

