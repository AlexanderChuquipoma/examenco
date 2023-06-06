/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import IDAO.IClienteDAO;
import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author ESTUDIENTE
 */
public class ClienteDAO implements IClienteDAO{

    private List<Cliente> listaClientes;
    @Override
    public void create(Cliente cliente) {
        listaClientes.add(cliente);
    }

    @Override
    public Cliente read(String cedula) {
        for(Cliente cliente: listaClientes){
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        int index = listaClientes.indexOf(cliente);
        listaClientes.set(index, cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        int index = listaClientes.indexOf(cliente);
        listaClientes.remove(index);
    }
    
}
