package day2c;
import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i=0;i< arr.length;i++){

            arr[i]= scanner.nextInt();

        }
        System.out.println("출력");
        System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);
        /*
        * for(int i=0; i <arr.length; i++){
        *   System.out.print(arr[i]);
        *   if (i<arr.length-1){
        *       Sysrm.out.print(", ");
        *    }
        * }
        * */
    }

}
