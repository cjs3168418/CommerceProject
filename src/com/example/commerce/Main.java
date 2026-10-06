package com.example.commerce;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Product electronicsProduct1 = new Product("Galaxy S25",
                1200000,"최신 안드로이드 스마트폰", 50);
        Product electronicsProduct2 = new Product("iPhone 16",
                1350000, "Apple의 최신 스마트폰", 30);
        Product electronicsProduct3 = new Product("MacBook Pro",
                2400000, "M3 칩셋이 탑재된 노트북", 15);
        Product electronicsProduct4 = new Product("Airpods Pro",
                350000, "노이즈 캔슬링 무선 이어폰", 20);

        Product clothingProduct1 = new Product("Black Hoodie",
                45000, "편하게 입기 좋은 검정색 후드티", 100);
        Product clothingProduct2 = new Product("White T-shirt",
                25000, "깔끔한 흰색 기본 반팔티", 200);
        Product clothingProduct3 = new Product("Blue Jeans",
                55000, "어디에나 잘 어울리는 기본 청바지", 80);
        Product clothingProduct4 = new Product("Gray Sweatshirt",
                35000, "편안하게 착용할 수 있는 회색 맨투맨", 120);

        Product foodProduct1 = new Product("Kimchi Fried Rice",
                8000, "매콤하고 맛있는 김치볶음밥", 100);
        Product foodProduct2 = new Product("Bulgogi Lunch Box",
                9500, "달콤한 양념의 불고기 도시락", 80);
        Product foodProduct3 = new Product("Chicken Salad",
                7500, "신선한 채소와 닭가슴살을 곁들인 샐러드", 120);
        Product foodProduct4 = new Product("Tteokbokki",
                5000, "매콤달콤한 소스의 떡볶이", 150);

        List<Product> electronicsProducts = new ArrayList<>();
        List<Product> clothingProducts = new ArrayList<>();
        List<Product> foodProducts = new ArrayList<>();

        electronicsProducts.add(electronicsProduct1);
        electronicsProducts.add(electronicsProduct2);
        electronicsProducts.add(electronicsProduct3);
        electronicsProducts.add(electronicsProduct4);

        clothingProducts.add(clothingProduct1);
        clothingProducts.add(clothingProduct2);
        clothingProducts.add(clothingProduct3);
        clothingProducts.add(clothingProduct4);

        foodProducts.add(foodProduct1);
        foodProducts.add(foodProduct2);
        foodProducts.add(foodProduct3);
        foodProducts.add(foodProduct4);

        Category electronicsCategory = new Category("전자제품", electronicsProducts);
        Category clothingCategory = new Category("의류", clothingProducts);
        Category foodCategory = new Category("식품", foodProducts);

        List<Category> categoryList = new ArrayList<>();

        categoryList.add(electronicsCategory);
        categoryList.add(clothingCategory);
        categoryList.add(foodCategory);

        Scanner sc = new Scanner(System.in);

        CommerceSystem commerceSystem = new CommerceSystem(categoryList, sc);



        commerceSystem.start();








    }
}

