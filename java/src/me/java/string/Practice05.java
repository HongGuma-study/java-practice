package me.java.string;

public class Practice05 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }
    //사이트에 올린 코드
    static boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'Y'){
                yCnt++;
            }else if(c == 'P'){
                pCnt++;
            }
        }

        answer = yCnt == pCnt;

        return answer;
    }
}
