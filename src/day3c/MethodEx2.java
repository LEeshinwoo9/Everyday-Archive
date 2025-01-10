package day3c;
import java.util.Scanner;
public class MethodEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 번 반복 할까요?");
        int count = scanner.nextInt();
        message(count);

    }
    public static void message(int count){

        for (int i=0;i<count;i++){

            System.out.println("Hello world!");
        }

    }
}
