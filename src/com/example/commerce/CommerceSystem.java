    package com.example.commerce;

    import java.util.List;
    import java.util.Scanner;

    public class CommerceSystem {

        //    프로그램 비즈니스 로직 클래스
        // 속성
        private Scanner scanner;
        private List<Category> categoryList;
        int command;

        // 생성자
        public CommerceSystem(List<Category> categoryList,Scanner scanner) {
            this.categoryList = categoryList;
            this.scanner = scanner;
        }
        // 기능
        // Product목록을 출력하는 기능
        public void start() {
            //반복문시작
            while (true) {
                int categoryNum = 1;
                // 카테고리 목록 출력
                System.out.println();
                System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
                for (Category category : categoryList) {
                    String categoryName = category.getCategoryName();
                    System.out.println(categoryNum + ". " + categoryName);
                    categoryNum++;
                }
                System.out.printf("%d. %-18s | 프로그램 종료 %n", 0, "Close");
                System.out.print("원하는 카테고리를 입력하세요: ");
                // 카테고리 목록에 대한 입력값 받기
                command = scanner.nextInt();

                // 받은 입력값에 대한 선택
                // 0 입력시 반복문 종료
                if (command == 0) {
                    System.out.println("커머스 플랫폼을 종료합니다.");
                    break;
                // 카테고리 내용에 대한 번호 입력시 상품 목록 출력
                } else if (0 < command && command <= categoryList.size()) {
                    Category selectedCategory = categoryList.get(command - 1);
                    System.out.println();
                    System.out.println("[ " + selectedCategory.getCategoryName() + " 카테고리 ]");
                    int i = 1;
                    for (Product product : selectedCategory.getProducts()) {
                        System.out.printf("%d. %-18s | %,10d원 | %s%n",
                                i++,
                                product.getProductName(),
                                product.getPrice(),
                                product.getDescription());
                    }
                    System.out.println("0. 뒤로가기");
                    System.out.print("원하는 상품을 입력하세요: ");
                    // 상품 목록에 대한 입력값 받기
                    command = scanner.nextInt();
                    // 상품 목록에 대한 번호 입력시 상품의 정보 출력
                    if (0 < command && command <= selectedCategory.getProducts().size()) {
                        Product product = selectedCategory.getProducts().get(command - 1);
                        System.out.println();
                        System.out.printf("선택한 상품: %-12s | %,10d원 | %s | 재고: %d개%n",
                                product.getProductName(),
                                product.getPrice(),
                                product.getDescription(),
                                product.getStockQuantity());
                        // 0 입력시 반복문 처음으로 돌아가기
                    } else if (command == 0){
                        System.out.println();
                        continue;
                        // 상품목록에서 없는 번호 출력시 반복문 처음으로 돌아가기
                    } else {
                        System.out.println("존재하지 않는 상품목록입니다. 다시 입력해주세요.");
                    }
                    // 카테고리에서 없는 번호 출력시 반복문 처음으로 돌아가기
                } else {
                    System.out.println("존재하지 않는 카테고리입니다. 다시 입력해주세요.");
                    continue;
                }



            }
        }


    }



