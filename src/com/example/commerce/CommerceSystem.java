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
    // Product목록을 출력하는 기능
    public void productListOutput() {
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
//        products 목록에 있는 product를 하나씩 출력
        int i = 1;
        for (Product product : products) {
//            상품의 번호. 상품이름 | 가격 | 상풍설명 을 출력
            System.out.printf("%d. %-15s | %,10d원 | %s%n",
                    i++,
                    product.getProductName(),
                    product.getPrice(),
                    product.getDescription());
        }
        System.out.printf("%d. %-15s | 프로그램 종료 %n", 0, "Close");
    }

    public void inputNumber(int num) {
        if (num == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }

}
