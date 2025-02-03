package task1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class First {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                playGame(scanner);


                System.out.print("게임을 다시 하시겠습니까? (Y/N): ");
                String retry = scanner.next().toUpperCase();

                if (!retry.equals("Y")) {
                    System.out.println("게임을 종료합니다. 감사합니다! ");
                    break;
                }
            }

            scanner.close();
        }

        public static void playGame(Scanner scanner) {
            Random random = new Random();


            int randomComNumSize = random.nextInt(5) + 1;
            int[] randomComNum = new int[randomComNumSize];

            for (int i = 0; i < randomComNumSize; i++) {
                randomComNum[i] = random.nextInt(10);
            }

            System.out.println("\n 야구 게임을 시작합니다!");
            System.out.println("컴퓨터가 " + randomComNumSize + "자리 수를 생성했습니다.");

            while (true) {
                System.out.print(randomComNumSize + "자리 숫자를 입력하세요: ");
                String userInput = scanner.next();


                if (!userInput.matches("\\d+")) {
                    System.out.println("숫자만 입력하세요!");
                    continue;
                }


                if (userInput.length() != randomComNumSize) {
                    System.out.println(randomComNumSize + "자리 숫자를 입력하세요!");
                    continue;
                }


                int[] userNumbers = new int[randomComNumSize];
                for (int i = 0; i < randomComNumSize; i++) {
                    userNumbers[i] = userInput.charAt(i) - '0';
                }


                int strikes = 0;
                int balls = 0;

                for (int i = 0; i < randomComNumSize; i++) {
                    for (int j = 0; j < randomComNumSize; j++) {
                        if (userNumbers[i] == randomComNum[j]) {
                            if (i == j) {
                                strikes++;  // 같은 자리 → 스트라이크
                            } else {
                                balls++;  // 다른 자리 → 볼
                            }
                        }
                    }
                }


                if (strikes == 0 && balls == 0) {
                    System.out.println("낫싱");
                } else {
                    System.out.println("결과: " + strikes + " 스트라이크, " + balls + " 볼");
                }

                if (strikes == randomComNumSize) {
                    System.out.println("정답입니다! 게임 종료.");
                    break;
                }
            }
        }
    }






