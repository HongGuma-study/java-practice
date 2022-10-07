package programmers;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b){
        String answer = "";
//        String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] dayOfWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day = 0;
        for(int i=1; i<a; i++) {
            if(i < 8){
                if(i % 2 == 0){
                    if(i == 2) day += 29;
                    else day += 30;
                }else day += 31;
            }else{
                if(i % 2 == 0) day += 31;
                else day += 30;
            }
        }
        day += b;
        System.out.println(day);
        answer = dayOfWeek[day % 7];
        return answer;
    }
}

