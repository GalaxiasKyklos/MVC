import mx.iteso.Producto;
import mx.iteso.ShoppingCart;
import mx.iteso.ShoppingController;
import mx.iteso.ShoppingView;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 26/11/2016.
 */
public class ShoppingControllerTest {
    public ShoppingController shoppingController;
    public ShoppingView shoppingView;
    public ShoppingCart shoppingCart;

    @Before
    public void setShoppingController() {
        shoppingCart = new ShoppingCart();
        shoppingView = new ShoppingView();
        shoppingController = new ShoppingController(shoppingCart, shoppingView);
    }

    @Test
    public void addProductoTest() {
        shoppingController.addProducto(new Producto("Producto", 0, 0));
        Assert.assertEquals(1, shoppingCart.getProductos().size(), 0);
    }

    @Test
    public void updateViewTest() {
        shoppingController.addProducto(new Producto("Producto", 0, 0));
        Assert.assertEquals("Nombre: Producto Cantidad: 0 Precio: 0.0\n", shoppingController.updateView());
    }
}
