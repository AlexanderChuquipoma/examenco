/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import IDAO.IProductoDAO;
import Modelo.Producto;
import java.util.List;

/**
 *
 * @author ESTUDIENTE
 */
public class ProductoDAO implements IProductoDAO{
    List<Producto> productos;

    @Override
    public void create(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto read(int codigo) {
        for(Producto producto: productos){
            if(producto.getCodigo()==codigo){
                return producto;
            }
        }
        return null;
    }

    @Override
    public void update(Producto producto) {
        int index = productos.indexOf(producto);
        productos.set(index, producto);
        
    }

    @Override
    public void delete(Producto producto) {
        int index = productos.indexOf(producto);
        productos.remove(index);
    }
    
}
