package programmers;

import java.util.*;

public class Budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println(solution(d,budget));
    }

    public static int solution(int[] d, int budget){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> departments = new ArrayList<>();
        for(int num : d){
            departments.add(num);
        }
        Collections.sort(departments);
        int sum = 0;
        for(int depart : departments) {
            stack.push(depart);
            sum += depart;
            if(sum > budget){
                stack.pop();
            }
        }

        return stack.size();
    }

}
