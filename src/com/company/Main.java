package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Product toothpaste = Catalogue.getProduct("Toothpaste");
        Product hairbrush = Catalogue.getProduct("Hairbrush");
        Product jam = Catalogue.getProduct("Jam");

        ShoppingCart cart= new ShoppingCart();
        cart.addLineItem(new LineItem(toothpaste, 1));
        cart.addLineItem(new LineItem(hairbrush, 1));
        cart.addLineItem(new LineItem(jam,2));

        System.out.println(cart.getTotalCost());

        Customer customer = new Customer("John Doe", 43435495940L);
        Optional<Order> order = customer.checkout(cart);
        System.out.println(order);
    }
}
