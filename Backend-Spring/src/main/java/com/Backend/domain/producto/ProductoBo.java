/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Backend.domain.producto;

import com.Backend.entities.Producto;
import com.Backend.repositories.IProductoRepository;
import com.Backend.util.exceptions.ResourceNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductoBo implements IProductoBOCRUD{
    
    @Autowired
    private IProductoRepository productoRepository;
    
    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(int producto_Id) {
        return productoRepository.findById(producto_Id)
                .orElseThrow(() -> new ResourceNotFoundException("No existe el producto con el id: "+producto_Id));
    }

    @Override
    public void delete(int insumo_Id) {
        productoRepository.deleteById(insumo_Id);
    }
    
    
}
