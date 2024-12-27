package com.ej1.app.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Mascota {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer idMascota;
String Nombre;
String tipo;
}
