package ch06.param;

public class ReferenceParamEx3 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 6, 5, 4};

        print(nums);
        sort(nums);
        print(nums);
        sum(nums);
    }

    private static void sum(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        System.out.println("[sum] : " + sum);
    }

    private static void sort(int[] nums) {
        System.out.print("[Bubble Sort ASC] ");

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j] = tmp;
                }
            }
        }
    }

    private static void print(int[] nums) {
        System.out.print("[print] ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
