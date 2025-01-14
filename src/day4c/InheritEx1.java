package day4c;

class Calculator{

    int left, right;
    public Calculator(int left,int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);

    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

}
class SubatractCalculator extends Calculator {

    public  SubatractCalculator(int left, int right) {
        super(left, right);
    }

    public void substract() {

        if (this.left > this.right) {
            System.out.println(this.left - this.right);
        } else {
            System.out.println(this.right - this.left);

        }
    }
}

public class InheritEx1 {


    public static void main(String[] args) {

        SubatractCalculator c1 =new SubatractCalculator(10,20);
        c1.sum();
        c1.avg();
        c1.substract();

    }

}
