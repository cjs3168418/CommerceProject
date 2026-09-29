package com.example.commerce;

import java.util.List;

public class CommerceSystem {
//    프로그램 비즈니스 로직 클래스
    // 속성
    private List<Product> products;

    // 생성자
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 기능
    public List<Product> getProducts() {
        return products;
    }
}
