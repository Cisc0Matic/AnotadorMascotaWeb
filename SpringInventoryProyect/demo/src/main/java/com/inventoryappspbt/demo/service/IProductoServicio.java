package com.inventoryappspbt.demo.service;

import java.util.List;

import com.inventoryappspbt.demo.models.producto;

public interface IProductoServicio {
public List<producto> listarProductos();
public producto buscarPorIdProducto(Integer idProducto);
public void guardarProducto(producto Producto);
public void eliminarProductoPorId(Integer idProducto);
}
