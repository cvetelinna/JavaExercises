package com.company;

public class Product {
    private String productName;
    private ProductType type;
    private int price;

    public Product(String productName, ProductType type, int price) {
        this.productName = productName;
        this.type = type;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public ProductType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}

