package programmers;

import java.util.PriorityQueue;

public class Spiciness {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,11,1000,123140,1230,76811,301,1203,30000,1200,184,1056007,77934,53,5886,77,78889,55543,2342,456547,887686,43321,432};
        System.out.println(solution(arrs,12000));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> lowestQueue = new PriorityQueue<>();

        for(int s : scoville)
            lowestQueue.add(s);

        while(true){
            if(lowestQueue.element() >= K) break;
            else{
                if(lowestQueue.size() < 2) return -1;
                int firstNum = lowestQueue.remove();
                int secondNum = lowestQueue.remove();
                int sum = firstNum + secondNum * 2;
                lowestQueue.add(sum);
                answer++;
            }
        }

        return answer;
    }

}
