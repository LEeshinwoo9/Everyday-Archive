package day2c;
import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr= new int[4][3];
        int[] total= new int[4];
        double[] average = new double[4];
        for(int i =1;i<arr.length+1;i++){

            System.out.println(i + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            int korean = scanner.nextInt();
            System.out.print("영어 점수:");
            int english = scanner.nextInt();
            System.out.print("수학 점수:");
            int math = scanner.nextInt();
            total[i-1]=korean+english+math;
            average[i-1]=(double) total[i-1]/3;

        }
        for(int j=1; j< arr.length+1; j++){

            System.out.println(j +"번 학생의 총점:"+ total[j-1] +", 평균:"+ average[j-1]);

        }

    }

}
/*
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int[][] scores = new int[4][3];
 String[] subjects = {"국어", "영어", "수학"};
 for(int i=0; i<4; i++){
 System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
 for(int j=0; j<3; j++){
 System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }
 for(int i=0; i<4; i++){
 int total = 0;
 for(int j=0; j<3; j++){
                total
+= scores[i][j];
            }
 double average = total / 3.0;
 System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " +
average);
        }
    }
 */
