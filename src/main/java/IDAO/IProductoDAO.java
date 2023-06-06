/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package IDAO;

import Modelo.Producto;

/**
 *
 * @author ESTUDIENTE
 */
public interface IProductoDAO {
    public void create(Producto producto);
    public Producto read(int codigo);
    public void update(Producto producto);
    public void delete(Producto producto);
}
