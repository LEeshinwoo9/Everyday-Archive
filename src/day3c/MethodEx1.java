package day3c;

public class MethodEx1 {
    public static void main(String[] args) {

        average(1,2,3);
        average(15,25,35);

    }
    public static void average(int a,int b,int c){

        double average = (a+b+c)/3;
        System.out.println("평균값:"+ average);

    }
}
