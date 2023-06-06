/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CarritoDAO;
import IDAO.ICarritoDAO;
import Modelo.Carrito;
import Modelo.Cliente;
import Vista.VistaCarrito;
import Vista.VistaCliente;

/**
 *
 * @author ESTUDIENTE
 */
public class ControladorCarrito {
    private VistaCarrito vistaCarrito;
    private VistaCliente vistaCliente;
    private Carrito carrito;
    private Cliente cliente;
    
    private ICarritoDAO carritoDAO;

    public ControladorCarrito(VistaCarrito vistaCarrito, Carrito carrito, CarritoDAO carritoDAO) {
        this.vistaCarrito = vistaCarrito;
        this.carrito = carrito;
        this.carritoDAO = (ICarritoDAO) carritoDAO;
    }
    
    public void agregarCarrito(){
        carrito = vistaCarrito.ingresarCarrito();
        carritoDAO.create(carrito);
        String cedula = vistaCliente.buscarCliente();
        
    }
    
    public void actualizarCarrito(){
        carrito = vistaCarrito.actualizarCarrito();
        carritoDAO.update(carrito);
    }
    
    public void eliminarCarrito(){
        carrito = vistaCarrito.eliminarCarrito();
        carritoDAO.delete(carrito);
    }
    
    public void verCarrito(){
        int codigo = vistaCarrito.buscarCarrito();
        carrito = carritoDAO.read(codigo);
        vistaCarrito.verCarrito(carrito);
    }
}
