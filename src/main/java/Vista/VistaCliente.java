/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author ESTUDIENTE
 */
public class VistaCliente {
    Scanner entrada;

    public VistaCliente() {
        entrada = new Scanner(System.in);
    }

    public Cliente agregarCliente() {
        System.out.println("Ingrese la cedula del cliente");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese los nombres del cliente");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese la direccion del cliente");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el numero de telefono del cliente");
        String telefono = entrada.nextLine();
        return new Cliente(cedula, nombres, apellidos, direccion, telefono);
    }

    public Cliente actualizarCliente() {
        System.out.println("Ingrese la cedula a actualizar");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese los nuevos datos del cliente");
        System.out.println("Ingrese los nombres del cliente");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese los apellidos del cliente");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese la direccion del cliente");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el numero de telefono del cliente");
        String telefono = entrada.nextLine();
        return new Cliente(cedula, nombres, apellidos, direccion, telefono);
    }

    public Cliente eliminarCliente() {
        System.out.println("Ingrese la cedula del cliente a eliminar");
        String cedula = entrada.nextLine();
        return new Cliente(cedula, null, null, null, null);
    }

    public String buscarCliente() {
        System.out.println("Ingrese la cedula del cliente a buscar");
        String cedula = entrada.nextLine();
        return cedula;
    }
    
    public void verCliente(Cliente cliente){
        System.out.println("Datos del cliente: "+ cliente);
    }
}
