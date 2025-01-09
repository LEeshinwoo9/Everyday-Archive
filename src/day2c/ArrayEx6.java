package day2c;
import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");

        int i = scanner.nextInt();
        int[] arr = new int[i];
        int big;
        int small;

        System.out.println(i+"개의 정수를 입력하세요:");

        for (int j=0;j< arr.length;j++) {

            arr[j] = scanner.nextInt();

        }
        big = small = arr[0];
        for (int j=0;j< arr.length;j++) {
             if(big<arr[j]) {

                 big = arr[j];
             }
             if (small>arr[j]) {

                 small = arr[j];
             }

        }

        System.out.println("가장 작은 정수:"+ small);
        System.out.println("가장 큰 정수:"+ big);

    }


}
