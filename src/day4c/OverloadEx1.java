package day4c;

class Calculator3{

    int [] oprands;

    public Calculator3(int [] oprands){
        this.oprands = oprands;
    }
    public void sum(){
        int total =0;
        for(int value : this.oprands){

            total +=value;

        }
        System.out.println(total);
    }
    public void avg(){
        int total =0;
        for(int value : this.oprands){

            total +=value;

        }
        System.out.println(total/ this.oprands.length);

    }
}


public class OverloadEx1 {

    public static void main(String[] args) {

         Calculator3 calculator3 =new Calculator3(new int[]{1,2,3,4,5});
         calculator3.avg();
         calculator3.sum();

    }

}



