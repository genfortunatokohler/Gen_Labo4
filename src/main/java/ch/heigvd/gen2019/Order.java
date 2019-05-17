package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    void getOrderContent(StringBuffer sb) {
        sb.append(String.format("{\"id\": %d, \"products\": [", id));
        for (int j = 0; j < getProductsCount(); j++) {
            getProduct(j).getProductContent(sb);
        }

        if (products.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("]}, ");
    }
}
