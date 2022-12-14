package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

public class TheKthNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(arr, commands)));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> splitArr = new ArrayList<>();
        int repeat = 0;
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            for(int num = i; num<j+1; num++){
                splitArr.add(array[num-1]);
            }
            Collections.sort(splitArr);
            answer[repeat] = splitArr.get(k-1);
            repeat++;
            splitArr.removeAll(splitArr);
        }
        return answer;
    }
}