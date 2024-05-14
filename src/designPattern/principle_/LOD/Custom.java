package designPattern.principle_.LOD;

/**
 * @author felix
 * @date 2024/5/10 16:09
 */
public class Custom {

    private String name;

    public Custom(String name){
        this.name = name;
    }

    public void placeOrder(Product product, Integer quantity){
        Order order = new Order(product, this, quantity);
        order.confirm();
    }
}
