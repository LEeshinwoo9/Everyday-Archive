package day3c;
import java.util.Scanner;
public class MethodEx3 {

    static int principal=10000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 금액 확인 | 4. 종료 ");
            int scan = scanner.nextInt();
            if(scan==1){
                System.out.print("입금 금액:");
                int mdeposit = scanner.nextInt();
                principal=deposit(mdeposit);
            } else if (scan==2) {
                System.out.print("출금 금액:");
                int mwithdraw = scanner.nextInt();
                if (mwithdraw<=principal) {
                    principal = withdraw(mwithdraw);
                }else{
                    System.out.println("잔액이 부족합니다.");
                }
            } else if (scan ==3) {
                System.out.println("현재 잔액은"+principal+"원 입니다.");
            }else if (scan ==4){
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
    public static int deposit(int a){

        int deposit= principal+a;
        return deposit;
    }
    public static int withdraw(int a){

        int withdraw= principal-a;
        return withdraw;
    }

}
