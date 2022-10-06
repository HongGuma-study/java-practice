package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Phonecatmon {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        int[] nums = {3,1,2,3};
        int[] nums = {3,3,3,2,2,4};
        System.out.println(solution.solution(nums));
    }
}

class Solution2{
    public int solution(int[] nums){
        int choiceNum = nums.length/2; //선택할 폰켓몬 수
        HashSet<Integer> numSet = new HashSet<>(); //중복을 제거한 폰켓몬 후보군 리스트
        for(int num : nums){
            numSet.add(num);
        }
        return Math.min(choiceNum, numSet.size()); //둘중 작은 수 리턴
    }


}

