package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class NoCompletion {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana", "mislav"};
        String[] completion = {"stanko", "ana", "mislav", "mislav"};
        System.out.println(solution(participant,completion));
    }
    public static String solution(String[] participant, String[] completion) {
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
}


