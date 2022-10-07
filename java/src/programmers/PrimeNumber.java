package programmers;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;

        boolean[] numArrays = new boolean[n+1];
        numArrays[0] = true;
        numArrays[1] = true;

        for(int i=2; i<=n; i++){
            if(numArrays[i]) continue;
            for(int j = i*2; j<=n; j+=i){
                numArrays[j] = true;
            }
        }

        for(boolean check : numArrays){
            if(!check) answer++;
        }

        return answer;
    }
}
