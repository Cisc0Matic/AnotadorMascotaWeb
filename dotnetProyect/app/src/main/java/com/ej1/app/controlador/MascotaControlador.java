package com.ej1.app.controlador;

import org.springframework.web.bind.annotation.RestController;
import com.ej1.app.modelos.Mascota;
import com.ej1.app.servicio.IMascotaServicio;
import ch.qos.logback.classic.Logger;
import lombok.var;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("app")
@CrossOrigin(value = "http://localhost:3000")

public class MascotaControlador {
private static final Logger logger = (Logger) LoggerFactory.getLogger(MascotaControlador.class);

@Autowired
private IMascotaServicio mascotaServicio;

 @PostMapping("/crear")
    public Mascota crearMascota(@RequestBody Mascota mascota) {
        return mascotaServicio.guardarMascota(mascota);
    }
 @PostMapping("/editar/{id}")
    public Mascota editarMascota(@PathVariable Integer id , @RequestBody Mascota mascota) {
        return mascotaServicio.guardarMascota(mascota);
    }

    @GetMapping("/listar")
    public List<Mascota> listarMascotas() {
        return mascotaServicio.ListarMascota();
    }

    @GetMapping("/buscar/{id}")
    public Mascota buscarMascota(@PathVariable Integer id) {
        return mascotaServicio.buscarMascotaPorId(id);
    }

    @DeleteMapping("/eliminar")
    public void eliminarMascota(@RequestBody Mascota mascota) {
        mascotaServicio.eliminarMascota(mascota);
    }

    @PutMapping("/cambiarid/{idMascota}/{idActual}")
    public ResponseEntity<Mascota> cambiarIdMascota(@PathVariable Integer idMascota, @PathVariable Integer idActual) {
        Mascota mascotaModificada = mascotaServicio.cambiarId(idMascota, idActual);
        if (mascotaModificada != null) {
            return ResponseEntity.ok(mascotaModificada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
}

