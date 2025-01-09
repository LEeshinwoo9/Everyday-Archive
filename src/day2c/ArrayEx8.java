package day2c;
import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productCount = 0;
        String[] productNames = new String[10];
        int[] productPrices = new int[10];


        while (true) {
            System.out.print("1. 상품등록 | 2. 상품 목록 | 3. 종료\n" + "메뉴를 선택하세요:");
            int choice = scanner.nextInt();


            if (choice == 1) {
                if (productCount < 10) {
                    scanner.nextLine(); //남아있는 개행문자 제거
                    System.out.print("상품 이름을 입력하세요:");
                    String productname = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요:");
                    int productPrice = scanner.nextInt();
                    productNames[productCount] = productname;
                    productPrices[productCount] = productPrice;
                    productCount++;
                } else {
                    System.out.println("상품을 더 등록할 수 없습니다.");
                }

            } else if (choice == 2) {

                if (productCount > 0) {

                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ":" + productPrices[i] + "원");
                    }
                } else {
                    System.out.println("등록된 상품이 없습니다.");
                }

            } else if (choice == 3) {

                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");

            }
        }
    }
}