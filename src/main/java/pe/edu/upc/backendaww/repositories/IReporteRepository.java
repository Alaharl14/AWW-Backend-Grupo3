package pe.edu.upc.backendaww.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.Reporte;

import java.util.List;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte,Integer> {
    @Query("from Reporte r where r.objeto.nombreObjeto like %:nombreObjeto%")
    List<Reporte> buscarObjeto(@Param("nombreObjeto") String nombreObjeto);

    @Query("from Reporte r where r.estadoreporte.nombreEstadoReporte like %:nombreEstadoReporte%")
    List<Reporte> buscarEstadoReporte(@Param("nombreEstadoReporte") String nombreEstadoReporte);

    @Query("from Reporte r where r.nombreReporte like %:nombreReporte%")
    List<Reporte> buscarReporte(@Param("nombreReporte") String nombreReporte);
}