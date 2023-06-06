/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import Modelo.Carrito;

/**
 *
 * @author ESTUDIENTE
 */
public interface ICarritoDAO {
    public void create(Carrito carrito);
    public Carrito read(int codigo);
    public void update(Carrito carrito);
    public void delete(Carrito carrito);
}
