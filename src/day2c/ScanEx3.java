package day2c;
import java.util.Scanner;

public class ScanEx3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int total=0;
        while(true){
            System.out.print("상품의 가격을 입력하세요(-1을 입력하면 종료)");
            int price = scanner.nextInt();
            System.out.print("구매하시려는 수량을 입력하세요:");
            int quantitiy = scanner.nextInt();
            if(price==-1){
                break;
            }
            int real_price= price * quantitiy;

            total += real_price;
            System.out.println("지금까지의 총비용은:"+ total +"입니다");
        }

    }


}
