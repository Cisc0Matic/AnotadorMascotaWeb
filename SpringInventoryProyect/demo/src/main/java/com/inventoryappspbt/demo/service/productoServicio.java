package com.inventoryappspbt.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventoryappspbt.demo.models.producto;
@Service
public class productoServicio implements IProductoServicio {
@Autowired
private productoRepositorio productoRepositorio;
    @Override
    public List<producto> listarProductos() {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarProductos'");
    }

    @Override
    public producto buscarPorIdProducto(Integer idProducto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorIdProducto'");
    }

    @Override
    public void guardarProducto(producto Producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarProducto'");
    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarProductoPorId'");
    }

}
