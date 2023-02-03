package ch05;

public class ArrayEx5 {

    /**
     * Purpose: 총합과 평균
     */

    public static void main(String[] args) {
        int sum = 0;
        float avg = 0.0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum = score[i];
        }

        avg = sum / (float)score.length;

        System.out.println("Total: " + sum);
        System.out.println("Avg: " + avg);
    }
}
