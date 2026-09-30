package com.example.commerce;


public class Product {
//    개별 상품 정보를 가지는 클래스

    // 속성
    private String productName;  //상품명
    private int price;           //가격
    private String description;  //설명
    private int stockQuantity;   //재고수량

    // 생성자
    public Product(String productName, int price,
                    String description, int stockQuantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    // 기능
    public String getProductName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }










}
