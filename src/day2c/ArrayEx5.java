package day2c;
import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int i= scanner.nextInt();
        int[] arr = new int[i];
        System.out.println(i+"개의 정수를 입력하세요:");
        int sum =0;
        for(int j=0; j<i;j++){

            arr[j]= scanner.nextInt();
            sum += arr[j];
        }

        int average = sum/i;
        System.out.println("입력한 정수의 합계:"+ sum);
        System.out.println("입력한 정수의 평균:"+ average);

    }


}
