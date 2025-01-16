package day5c;

abstract class Calculator{

    int left, right;
    public Calculator(int left,int right){
        this.left=left;
        this.right=right;

    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator{
    public CalculatorDecoPlus(int left, int right) {
        super(left, right);
    }

    @Override
    public void sum(){
        System.out.println("+sum: "+ (this.left+this.right));
    }
    public void avg(){
        System.out.println("+avg: "+ (this.left+this.right)/2);

    }

}
class CalculatorDecoMinus extends Calculator {
    public CalculatorDecoMinus(int left,int right){
        super(left, right);

    }
    @Override
    public void sum() {
        System.out.println("-sum: " + (this.left + this.right));
    }

    public void avg() {
        System.out.println("-avg: " + (this.left + this.right) / 2);

    }
}

public class AbstractEx1 {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus(10,20);
        c1.run();
        CalculatorDecoMinus c2 = new CalculatorDecoMinus(10,20);
        c2.run();


    }


}
