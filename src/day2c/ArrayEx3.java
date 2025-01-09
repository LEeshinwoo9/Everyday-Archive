package day2c;

public class ArrayEx3 {

    public static void main(String[] args) {
        int total =0;

        int[] student={90,80,70,60,50};
        for(int i=0;i<student.length;i++){

            total += student[i];

        }

        int average= total/student.length;
        System.out.println("점수 총합:"+ total);
        System.out.println("점수 평균:"+ average);

    }

}

