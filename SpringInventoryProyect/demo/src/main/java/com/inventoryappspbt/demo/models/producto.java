package com.inventoryappspbt.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class producto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer idProducto;
String descripcion;
Double precio;
Integer Existencia;
}
