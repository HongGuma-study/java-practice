package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class NoCompletion {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav"};
        String[] completion = {"stanko", "ana", "mislav", "mislav"};
        Solution test = new Solution();
        System.out.println(test.solution(participant,completion));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> participantMap = new HashMap<>();

        for(String parti : participant){
            if(participantMap.containsKey(parti)){
                int cnt = participantMap.get(parti);
                participantMap.put(parti,++cnt);
            }else{
                participantMap.put(parti,0);
            }
//            participantMap.put(parti,cnt);
        }

        System.out.println(participantMap.keySet());
        System.out.println(participantMap.values());

        for(int i=0; i<completion.length; i++){
            if(participantMap.containsKey(completion[i])){
                int cnt = participantMap.get(completion[i]);
                participantMap.put(completion[i],--cnt);
            }
        }

        System.out.println(participantMap.values());
        for(String key : participantMap.keySet()){
            if(participantMap.get(key) == 0){
                answer = key;
            }
        }

        return answer;

    }
 /*   public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> pArr = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> cArr = new ArrayList<>(Arrays.asList(completion));
        Collections.sort(pArr);
        Collections.sort(cArr);

        for(int i=0; i<cArr.size(); i++){
            if(pArr.get(i) != cArr.get(i)){
                answer = pArr.get(i);
            }
        }


        return answer;
    }*/
}
