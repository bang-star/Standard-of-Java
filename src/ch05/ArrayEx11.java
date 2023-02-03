package ch05;

public class ArrayEx11 {

    /**
     * Purpose: 길이가 10인 배열을 만들고 0과 9사이의 임의의 값으로 초기화하고 배열에 저장된 각 숫자가 몇번반복해서 나타나는지를 출력하는 로직
     */

    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] counter = new int[10];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
            System.out.print(nums[i]);
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + "의 개수" + counter[i]);
        }
    }
}
