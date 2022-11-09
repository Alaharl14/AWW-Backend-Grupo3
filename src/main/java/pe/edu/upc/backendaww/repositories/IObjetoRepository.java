package pe.edu.upc.backendaww.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendaww.entities.Distrito;
import pe.edu.upc.backendaww.entities.Objeto;

import java.util.List;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto,Integer> {
    @Query("from Objeto o where o.nombreObjeto like %:nombreObjeto%")
    List<Objeto> buscarObjeto(@Param("nombreObjeto") String nombreObjeto);
}
