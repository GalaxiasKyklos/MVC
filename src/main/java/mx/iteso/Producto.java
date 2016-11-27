package mx.iteso;

/**
 * Created by Rodolfo on 26/11/2016.
 */
public class Producto {
    private String name;
    private double precio;
    private int cantidad;

    public Producto(String name, double precio, int cantidad) {
        this.name = name;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getName() {
        return name;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


}
