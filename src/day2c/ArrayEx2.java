package day2c;

public class ArrayEx2 {

    public static void main(String[] args) {

        // 기존 for문으로 배열 속성 나타내기
        int[]arr={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){

            int num =arr[i];
            System.out.println(num);


        }
        // 향상된 for문으로 배열 속성 나타내기
        int []arr2={6,7,8,9,10};
        for (int num2 : arr2){

            System.out.println(num2);
        }


    }



}
