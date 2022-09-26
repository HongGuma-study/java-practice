package me.java.arrays;

public class Practice02 {
    public static void main(String[] args) {
        final int NUM_COUNT = 100;
        int[] nums = new int[NUM_COUNT];
        int min,max;
        for(int i=0; i<100; i++){
            nums[i] = (int) (Math.random() * 100) + 1; //랜덤으로 숫자 생성
        }

        min = nums[0];
        max = nums[0];

        for(int num : nums){
            if(max < num) max = num;
            if(min > num) min = num;
        }

    }
}
