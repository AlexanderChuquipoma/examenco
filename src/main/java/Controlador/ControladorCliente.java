/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.ClienteDAO;
import IDAO.IClienteDAO;
import Modelo.Cliente;
import Vista.VistaCliente;

/**
 *
 * @author ESTUDIENTE
 */
public class ControladorCliente {
    private VistaCliente vistaCliente;
    private Cliente cliente;
    private IClienteDAO clienteDAO;

    public ControladorCliente(VistaCliente vistaCliente, Cliente cliente, ClienteDAO clienteDAO) {
        this.vistaCliente = vistaCliente;
        this.cliente = cliente;
        this.clienteDAO = (IClienteDAO) clienteDAO;
    }

    public void agregarCliente() {
        cliente = vistaCliente.agregarCliente();
        clienteDAO.create(cliente);
    }
    
    public void actualizarCliente(){
        cliente = vistaCliente.actualizarCliente();
        clienteDAO.update(cliente);
    }
    
    public void eliminarCliente(){
        cliente = vistaCliente.eliminarCliente();
        clienteDAO.delete(cliente);
    }
    
    public void verCliente(){
        String cedula = vistaCliente.buscarCliente();
        cliente = clienteDAO.read(cedula);
        vistaCliente.verCliente(cliente);
    }
}
