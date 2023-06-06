/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ProductoDAO;
import IDAO.IProductoDAO;
import Modelo.Producto;
import Vista.VistaProducto;

/**
 *
 * @author ESTUDIENTE
 */
public class ControladorProducto {
    private VistaProducto vistaProducto;
    private Producto producto;
    private IProductoDAO productoDAO;

    public ControladorProducto(VistaProducto vistaProducto, Producto producto, ProductoDAO productoDAO) {
        this.vistaProducto = vistaProducto;
        this.producto = producto;
        this.productoDAO = (IProductoDAO) productoDAO;
    }

    public void agregarProducto() {
        producto = vistaProducto.ingresarProducto();
        productoDAO.create(producto);

    }
    
    public void actualizarProducto(){
        producto = vistaProducto.actualizarProducto();
        productoDAO.update(producto);
    }
    
    public void eliminarProducto(){
        producto = vistaProducto.eliminarProducto();
        productoDAO.delete(producto);
    }
    
    public void verProducto(){
        int codigo = vistaProducto.buscarProducto();
        producto = productoDAO.read(codigo);
        vistaProducto.verProducto(producto);
    }
}
