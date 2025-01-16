package day6c;

interface I2{
    public String A();
}
interface  I3{
    public String B();
}

class D implements I2,I3{

    @Override
    public String A() {
        return "A";
    }

    @Override
    public String B() {
        return "B";
    }
}

public class PolymorphismEx1 {

    public static void main(String[] args) {
        D obj = new D();
        I2 obj1 = new D();
        I3 obj2 = new D();

        obj.A();
        obj.B();
        obj1.A();
        // obj1.B();
        //obj2.A();
        obj2.B();


    }

}
