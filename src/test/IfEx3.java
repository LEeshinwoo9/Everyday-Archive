
package test;

    public class IfEx3 {

        public static void main(String[] args){

            String grade = "A";

            String result = switch (grade) {
                case "A" -> "탁월한 성과입니다!";
                case "B" -> "좋은 성과입니다!";
                case "C" -> "준수한 성과입니다!";
                case "D" -> "향상이 필요합니다";
                default -> "알 수 없는 성과입니다";  // 기본값 추가
            };

            System.out.println(result); // 결과 출력
        }

    }
