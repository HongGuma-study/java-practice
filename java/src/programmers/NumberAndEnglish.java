package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class NumberAndEnglish {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        String answer = "";
        String tmp = "";
        HashMap<String,Integer> enTable = setTable();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                answer += s.charAt(i);
            }else{
                tmp += s.charAt(i);
                if(enTable.containsKey(tmp)) {
                    answer += enTable.get(tmp);
                    tmp = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }

    public static HashMap<String,Integer> setTable(){
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] enArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<10; i++){
            hashMap.put(enArr[i],i);
        }

        return hashMap;
    }
}
