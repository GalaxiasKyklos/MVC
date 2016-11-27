package mx.iteso;

/**
 * Created by Rodolfo on 26/11/2016.
 */
public class ShoppingController {
    private ShoppingCart shoppingCart;
    private ShoppingView shoppingView;


    public ShoppingController(ShoppingCart shoppingCart, ShoppingView shoppingView) {
        this.shoppingCart = shoppingCart;
        this.shoppingView = shoppingView;
    }

    public void addProducto(Producto producto){
        shoppingCart.addProducto(producto);
    }



    public String updateView(){
        String result=shoppingView.printProducto(shoppingCart.getProductos());
        System.out.println(result);
        return result;
    }

}
