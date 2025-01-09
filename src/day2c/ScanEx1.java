package day2c;
import java.util.Scanner;

public class ScanEx1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요:");
        int age = scanner.nextInt();
    }
}

