package com.inventoryappspbt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryappspbt.demo.models.producto;

public interface productoRepositorio extends JpaRepository<producto, Integer> {

}
