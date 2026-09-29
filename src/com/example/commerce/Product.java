package com.example.commerce;

public class Product {
//    개별 상품 정보를 가지는 클래스
@Override
public String toString() {
    return "상품명: " + productName + " | " + "가격: " + price + " | "
            + " 제품설명: " + description + " | " + "재고수량: " + stockQuantity;
}
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






}
