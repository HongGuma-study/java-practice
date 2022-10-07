package programmers;

import java.util.Arrays;

public class MockTest {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5,1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] tester1 = {1,2,3,4,5};
        int[] tester2 = {2,1,2,3,2,4,2,5};
        int[] tester3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3]; //수포자점수
        int max = 0;

        int i=0;
        for(int ans : answers){
            if(ans == tester1[i % tester1.length]) cnt[0]++;
            if(ans == tester2[i % tester2.length]) cnt[1]++;
            if(ans == tester3[i % tester3.length]) cnt[2]++;
            i++;
        }
        System.out.println(Arrays.toString(cnt));
        for(int n=0; n<cnt.length; n++){
            if(max < cnt[n]){
                max = cnt[n];
            }
        }

        return answer;
    }

    public void compare(int[] arr){
        int[] result = {};
        if(arr[0] == arr[1] && arr[0] == arr[2]){

        }else if(arr[0] == arr[1]){

        }else if(arr[1] == arr[2]){

        }else if(arr[0] == arr[2]){

        }else{
            int max = 0;
            for(int i=0; i<3; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }

        }
    }

    /*public static int[] solution(int[] answers) {
        int[] answer = {};

        for(int i=0; i<answers.length; i++){
//            System.out.printf("%d, ",(i%5)+1); //수포자 1
//            if(i%2 == 0) System.out.printf("%d, ",2); //수포자 2
//            else System.out.printf("%d, ",i%6);

        }

        return answer;
    }*/
}
