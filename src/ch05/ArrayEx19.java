package ch05;

public class ArrayEx19 {

    /**
     * Purpose: 5명의 학생의 세 과목 점수를 더해서 각 학생의 총점과 평균을 계산하고,
     *          과목별 총점을 계산하여 출력
     */

    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        // 과목별 총점
        int kor = 0, math = 0, eng = 0;

        System.out.println("번호  국어  수학  영어  총점  평균 ");
        System.out.println("=============================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            kor += score[i][0];
            math += score[i][1];
            eng += score[i][2];

            System.out.printf("%3d", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=============================");
        System.out.printf("총점: %3d %4d %4d %n", kor, math, eng);
    }
}
