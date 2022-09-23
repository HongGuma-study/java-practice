package me.java.string;


public class Practice06 {
    //디버깅용 코드
    public static void main(String[] args) {
        System.out.println(solution("01012345678"));
    }
    //실제 제출한 코드
    public static String solution(String phone_number) {
        String answer = ""; //정답
        String tmp1 = ""; //임시 변수1 (뒷 4자리를 제외한 나머지 숫자를 저장)
        String tmp2 = ""; //임시 변수2 (뒷 4자리를 저장)
        int strL = phone_number.length(); //전화 번호 길이
        for(int i=0 ;i<strL-4; i++){ // 전화번호 뒷 4자리를 제외한 나머지 숫자 길이
            tmp1 += "*"; //뒷 4자리를 제외한 숫자 수 만큼 *을 찍는다.
        }
        tmp2 = phone_number.substring(strL-4,strL); //전화 번호 뒷 4자리 추출
        answer = tmp1+tmp2; // * 찍은 문자열 과 뒷 4자리를 합친다.
        return answer; //정답 반환
    }

}
