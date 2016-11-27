package mx.iteso;

import java.util.ArrayList;

/**
 * Created by Saúl on 26/11/2016.
 */
public class ShoppingCart{
    private ArrayList<Producto> productos;

    public ShoppingCart() {
        this.productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
       this.productos.add(producto);
    }

}
