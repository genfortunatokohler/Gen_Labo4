package ch.heigvd.gen2019;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    void getProductContent(StringBuffer sb) {
        sb.append(String.format("{\"code\": \"%s\", \"color\": \"%s\", ", code, getColor() != null ? getColor() : "no color"));

        if (getSize() != null) {
            sb.append(String.format("\"size\": \"%s\", ", size));
        }

        sb.append(String.format("\"price\": %s, \"currency\": \"%s\"}, ", Double.toString(price), currency));
    }
}