package pe.edu.upc.backendaww.servicesinterfaces;

import pe.edu.upc.backendaww.entities.Objeto;

import java.util.List;
import java.util.Optional;

public interface IObjetoService {

    public boolean insertar(Objeto objeto);
    List<Objeto> listar();
    public void eliminar(int idObjeto);
    public Optional<Objeto> listarId(int idObjeto);
    List<Objeto> buscarObjeto(String nombreObjeto);
}
