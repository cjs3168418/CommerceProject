package com.example.commerce;

import java.util.List;

public class Category  {
//    Product 클래스를 관리하는 클래스
    // 속성    전자제품 / 의류 / 식품
    private String categoryName;
    private List<Product> products;

    // 생성자
    public Category (String categoryName,List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    // 기능


    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }
}
