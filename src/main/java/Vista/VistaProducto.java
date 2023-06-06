/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author ESTUDIENTE
 */
public class VistaProducto {
    Scanner entrada;

    public VistaProducto() {
        entrada = new Scanner(System.in);
    }

    public Producto ingresarProducto() {
        System.out.println("Ingrese el codigo del producto");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del producto");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese una descripcion del producto");
        String descripcion = entrada.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = entrada.nextDouble();
        return new Producto(codigo, nombre, descripcion, precio);
    }

    public Producto actualizarProducto() {
        System.out.println("Ingrese el codigo del producto a actualizar");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese los nuevos datos del producto");
        System.out.println("Ingrese el nombre del producto");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese una descripcion del producto");
        String descripcion = entrada.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = entrada.nextDouble();
        return new Producto(codigo, nombre, descripcion, precio);
    }

    public Producto eliminarProducto() {
        System.out.println("Ingrese el codigo del producto a eliminar");
        int codigo = entrada.nextInt();
        return new Producto(codigo, null, null, 0);
    }
    
    
    public int buscarProducto(){
        System.out.println("Ingrese el codigo del producto a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void verProducto(Producto producto){
        System.out.println("Datos del producto: "+ producto);
    }
}
