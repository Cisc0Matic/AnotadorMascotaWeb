package com.ej1.app.servicio;
import java.util.List;

import com.ej1.app.modelos.Mascota;
public interface IMascotaServicio {

    public List<Mascota> ListarMascota();

    public Mascota buscarMascotaPorId(Integer idMascota);

    public Mascota guardarMascota(Mascota mascota);

    public Mascota editarMascota(Integer idMascota, Mascota mascota);

    public Mascota cambiarId(Integer idMascota, Integer idActual);

public void eliminarMascota(Mascota mascota);
}
