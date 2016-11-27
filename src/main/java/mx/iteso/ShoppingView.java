package mx.iteso;

import java.util.ArrayList;

/**
 * Created by Rodolfo on 26/11/2016.
 */
public class ShoppingView {

    public String printProducto(ArrayList<Producto> productos){
        String result="";
        for(Producto producto: productos){
            result+="Nombre: "+producto.getName()+" Cantidad: "+producto.getCantidad()+" Precio: "+producto.getPrecio()+"\n";
        }
        return result;
    }
}
