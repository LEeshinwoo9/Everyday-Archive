package day2c;

public class ArrayEx1 {

    public static void main(String[] args){

        int[][] arr =new int[2][3];
        int i =0;
        for (int row=0;row< arr.length;row ++){

            for (int column=0;column<arr[row].length;column++){

                arr[row][column]= ++i;
                System.out.print(arr[row][column]);


            }

        System.out.println();

        }

    }

}