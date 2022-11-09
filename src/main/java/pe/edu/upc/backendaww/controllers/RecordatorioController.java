package pe.edu.upc.backendaww.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendaww.entities.Recordatorio;
import pe.edu.upc.backendaww.servicesinterfaces.IRecordatorioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recordatorio")
public class RecordatorioController {
    @Autowired
    private IRecordatorioService rtService;
    @PostMapping
    public void registrar(@RequestBody Recordatorio rt){rtService.insertar(rt);}
    @GetMapping
    public List<Recordatorio> list(){return rtService.listar();}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){rtService.eliminar(id);}
    @PutMapping
    public void modificar(@RequestBody Recordatorio recordatorio){
        rtService.insertar(recordatorio);
    }
    @PostMapping("/buscar")
    public List<Recordatorio> buscar(@RequestBody Recordatorio recordatorio){
        List<Recordatorio> lista;
        recordatorio.setEstadoRecordatorio(recordatorio.getEstadoRecordatorio());
        lista=rtService.buscarRecordatorio(recordatorio.getEstadoRecordatorio());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Recordatorio> listarId(@PathVariable("id") Integer id) {
        return rtService.listarId(id);
    }
}