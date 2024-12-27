package com.ej1.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ej1.app.modelos.Mascota;
@Repository
public interface MascotaRepositorio extends JpaRepository<Mascota, Integer>{

}
