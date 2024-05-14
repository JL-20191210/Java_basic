package designPatterns.LOD;

/**
 * @author felix
 * @date 2024/5/10 16:10
 */
public class Order {

    private Product product;

    private Custom custom;

    int quantity;

    public Order(Product product,Custom custom,Integer quantity){
        this.product = product;
        this.custom = custom;
        this.quantity = quantity;
    }

    public void confirm(){
        System.out.println("确认订单");
    }
}
