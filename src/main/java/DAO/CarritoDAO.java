/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import IDAO.ICarritoDAO;
import Modelo.Carrito;
import java.util.List;

/**
 *
 * @author ESTUDIENTE
 */
public class CarritoDAO implements ICarritoDAO{
    List<Carrito> carritos;

    @Override
    public void create(Carrito carrito) {
       carritos.add(carrito);
    }

    @Override
    public Carrito read(int codigo) {
        for(Carrito carrito: carritos){
            if(carrito.getCodigo()==codigo){
                return carrito;
            }
        }
        return null;
    }

    @Override
    public void update(Carrito carrito) {
        int index = carritos.indexOf(carrito);
        carritos.set(index, carrito);
    }

    @Override
    public void delete(Carrito carrito) {
        int index = carritos.indexOf(carrito);
        carritos.remove(index);
    }
}
