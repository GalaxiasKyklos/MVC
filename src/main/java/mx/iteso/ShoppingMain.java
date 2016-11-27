package mx.iteso;

/**
 * Created by Rodolfo on 26/11/2016.
 */
public class ShoppingMain {
    public static void main(String args[]){
        ShoppingController shoppingController= new ShoppingController(new ShoppingCart(),new ShoppingView());
        shoppingController.addProducto(new Producto("Ariel",45.50,1));
        shoppingController.addProducto(new Producto("Zucaritas",20.32,2));


        shoppingController.updateView();
    }
}
