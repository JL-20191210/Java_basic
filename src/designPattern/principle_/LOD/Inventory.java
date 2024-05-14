package designPattern.principle_.LOD;

import java.util.HashMap;
import java.util.Map;

/**
 * @author felix
 * @date 2024/5/10 16:10
 */
public class Inventory {
    //库存
    private Map<Product,Integer> stock;

    public Inventory(){
        this.stock = new HashMap<>();
    }

    public void addToInventory(Product product, Integer quantity){
        //如果该产品存在返回其库存值否则返回0
        stock.put(product,stock.getOrDefault(product,0)+quantity);
    }

    //出库前检查库存是否充足
    public boolean checkAvailability(Product product, Integer quantity){
        return stock.getOrDefault(product,0) >= quantity;
    }

}
