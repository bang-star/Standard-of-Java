package ch05;

public class ArrayEx10 {

    /**
     * Purpose: 버블정렬 알고리즘을 통해 크기순으로 정렬하는 예제
     */

    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] = (int) (Math.random() * 10));
        }

        System.out.println();

        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) break;

            for (int k = 0; k < nums.length; k++) {
                System.out.print(nums[k]);
            }

            System.out.println();
        }
    }
}
