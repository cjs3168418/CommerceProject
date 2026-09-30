package com.example.commerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Galaxy S25",
                1200000,"최신 안드로이드 스마트폰", 50);
        Product product2 = new Product("iPhone 16",
                1350000, "Apple의 최신 스마트폰", 30);
        Product product3 = new Product("MacBook Pro",
                2400000, "M3 칩셋이 탑재된 노트북", 15);
        Product product4 = new Product("Airpods Pro",
                350000, "노이즈 캔슬링 무선 이어폰", 20);

        // 1. 클래스 Product로 지정한 prdocut1,2,3에 값을 넣어준다.
        // 2. CommerceSystem으로 Product목록을 넘겨준다.
        // 3. CommerceSystem에서 Product목록을 출력한다.

        List<Product> products = new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        CommerceSystem commerceSystem = new CommerceSystem(products);

        commerceSystem.productListOutput();

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        commerceSystem.inputNumber(number);




    }
}
