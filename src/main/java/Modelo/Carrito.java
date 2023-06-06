/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author ESTUDIENTE
 */
public class Carrito {
    private int codigo;
    private GregorianCalendar fecha;
    private double subtotal;
    private double iva;
    private double total;
    private Cliente cliente;
    private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public Carrito(GregorianCalendar fecha, int codigo) {
        this.fecha = fecha;
        this.codigo= codigo;
        productos = new ArrayList<>();
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public void calcularSubtotal() {
        subtotal = 0;
        for (Producto producto : productos) {
            subtotal += producto.getPrecio();
        }

    }
    
    public void calcularIva() {
        this.iva = subtotal * 0.12;
    }

    public void calcularTotal() {
        this.total = subtotal + iva;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Carrito{" + "codigo=" + codigo + ", fecha=" + fecha + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + ", productos=" + productos + '}';
    }

  
}
