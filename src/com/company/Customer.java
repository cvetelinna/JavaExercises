package com.company;

import java.util.Optional;

public class Customer {
    private final String name;
    private CreditCard creditCardNum;

    public Customer(String name, long creditCardNum) {
        this.name = name;
        this.creditCardNum = new CreditCard(creditCardNum);
    }

    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment = creditCardNum.mkPayment(cart.getTotalCost());
        return payment.map(value -> new Order(this, cart, value));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCardNum +
                '}';
    }
}
