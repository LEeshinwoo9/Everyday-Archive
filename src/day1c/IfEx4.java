package day1c;

public class IfEx4 {

        public static void main(String[] args) {
            int sum = 0; // 누적 합계를 저장할 변수
            int maxNumber = 0; // 합계가 10보다 작은 동안 가장 큰 숫자를 저장할 변수

            for (int i = 1; sum + i < 10; i++) {
                sum += i; // 누적합 계산
                maxNumber = i; // 합계가 10보다 작은 동안 i를 가장 큰 값으로 저장
            }

            System.out.println("합계가 10보다 작을 때 가장 큰 값: " + maxNumber);
        }
    }
