package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Galaxy S24", 120000,
                "최신 스마트폰", 50);
        Product product2 = new Product("청소기", 550000,
                "최신 청소기", 30);
        Product product3 = new Product("냉장고", 1000000,
                "최신 냉장고", 15);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        CommerceSystem commerceSystem = new CommerceSystem(products);

        for (Product product : products) {
            System.out.println("[" + product + "]");
        }


    }
}
