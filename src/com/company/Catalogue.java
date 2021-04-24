package com.company;

import java.util.Map;

public class Catalogue {
    private static Map<String, Product> productMap = Map.of(
            "Toothpaste", new Product("Toothpaste", ProductType.DIGITAL, 3400),
            "Hairbrush", new Product("Hairbrush", ProductType.PHYSICAL, 3500),
            "Jam", new Product("Jam", ProductType.DIGITAL, 1500)
    );

    public static Product getProduct(String productName){
        return productMap.get(productName);
    }
}
