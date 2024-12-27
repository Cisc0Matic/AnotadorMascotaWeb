package com.ej1.app.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ej1.app.modelos.Mascota;
import com.ej1.app.repositorio.MascotaRepositorio;
@Service
public class MascotaServicio implements IMascotaServicio{
@Autowired
private MascotaRepositorio mascotarepositorio;

    @Override
    public List<Mascota> ListarMascota() {
        // TODO Auto-generated method stub
        return mascotarepositorio.findAll();
    }

    @Override
    public Mascota buscarMascotaPorId(Integer idMascota) {
        // TODO Auto-generated method stub
        return mascotarepositorio.findById(idMascota).orElse(null);
    }

    @Override
    public Mascota guardarMascota(Mascota mascota) {
        // TODO Auto-generated method stub
        return mascotarepositorio.save(mascota);
    }

    @Override
    public void eliminarMascota(Mascota mascota) {
        // TODO Auto-generated method stub
        mascotarepositorio.delete(mascota);
    }

    @Override
    public Mascota editarMascota(Integer idMascota, Mascota mascota) {
        Mascota mascotaExistente = mascotarepositorio.findById(idMascota).orElse(null);
        if (mascotaExistente != null) {
            mascotaExistente.setNombre(mascota.getNombre());
            mascotaExistente.setTipo(mascota.getTipo());
            // Actualiza otros campos según sea necesario

            return mascotarepositorio.save(mascotaExistente);
        } else {
            return null;
        }

        
    }

    @Override
    public Mascota cambiarId(Integer idMascota, Integer idActual) {
        Mascota mascotaExistente = mascotarepositorio.findById(idMascota).orElse(null);
        if (mascotaExistente != null) {
            mascotaExistente.setIdMascota(idActual); // Asegúrate de que este método exista en la entidad Mascota
            return mascotarepositorio.save(mascotaExistente);
        } else {
            return null; // O manejo adecuado si la mascota no existe
        }
        }

    }

 
    

