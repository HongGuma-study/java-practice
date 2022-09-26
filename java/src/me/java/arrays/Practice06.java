package me.java.arrays;

public class Practice06 {
    public static void main(String[] args) {

    }

    //실제로 제출한 코드
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n]; //답변 배열 정의
            String strFormat = "%0"+n+"d"; //출력 포멧 (맨 앞자리에 0이 나오는 경우 때문에)
            for(int i=0; i<n; i++){ //숫자만큼 반복
                String binary = Long.toBinaryString(arr1[i] | arr2[i]); // 두개의 숫자를 or 해서 binary 로 변환 (숫자가 큰 경우를 대비해 Long으로 변환
                String tmp = String.format(strFormat,Long.parseLong(binary)); //포멧에 맞춰 String 출력 ( 숫자를 뒤에서 부터 채우며 나머지 자리는 0으로 채움)
                answer[i] = ""; //배열의 초기 값은 null 임으로 ""로 초기화
                for(int j=0; j<tmp.length(); j++){
                    if(tmp.charAt(j) == '1') answer[i] += "#"; //1이면 #
                    else answer[i] += " "; //0이면 " "
                }

            }

            return answer;
        }
    }
}


