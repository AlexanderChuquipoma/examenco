/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Carrito;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ESTUDIENTE
 */
public class VistaCarrito {
    Scanner entrada;

    public VistaCarrito() {
        entrada = new Scanner(System.in);
    }
    
    public Carrito ingresarCarrito(){
        System.out.println("Ingresar el codigo del carrito");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese la fecha del carrito");
        System.out.println("Año");
        int anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Mes");
        int mes = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dia");
        int dia = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Hora");
        int hora = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Minutos");
        int minuto = entrada.nextInt();
        entrada.nextLine();
        GregorianCalendar fecha = new GregorianCalendar(anio, mes, dia, hora, minuto);

        return new Carrito(fecha, codigo);
    }
    
    public Carrito actualizarCarrito(){
        System.out.println("Ingresar el codigo del carrito a actualizar");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese la fecha del carrito");
        System.out.println("Año");
        int anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Mes");
        int mes = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dia");
        int dia = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Hora");
        int hora = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Minutos");
        int minuto = entrada.nextInt();
        entrada.nextLine();
        GregorianCalendar fecha = new GregorianCalendar(anio, mes, dia, hora, minuto);

        return new Carrito(fecha, codigo);
    }
    
    public Carrito eliminarCarrito(){
        System.out.println("Ingresar el codigo del carrito a eliminar");
        int codigo = entrada.nextInt();
        return new Carrito(null, codigo);
    }
    
    public int buscarCarrito(){
        System.out.println("Ingrese el codigo del carrito a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void verCarrito(Carrito carrito){
        System.out.println("Datos del carrito: "+ carrito);
    }
    

}
