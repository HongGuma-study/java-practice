package me.java.inheritance.practice01;

/**
 * 실습 문제 4번 출력 확인용
 */
public class practice04 {
    public static void main(String[] args) {
        User user = new User("123","123","010-1234-5678","user@email.com",19910101,"model-1","pay-1");

        String[] candidates = new String[10];
        System.out.print("candidates = ");
        for(int i=0; i<10; i++){
            candidates[i] = "010-"+randomNumber()+"-"+randomNumber();
            System.out.print(candidates[i]+", ");
        }

        System.out.println();
        System.out.println("old Number = "+user.getMemberPhoneNumber());
        System.out.println("user New Number = "+user.getNewPhoneNumber(candidates));

    }

    /**
     * 랜덤 폰번호 만들기
     * @return 완성된 폰번호
     */
    public static String randomNumber(){
        String randomNum = "";
        for(int i=0; i<4; i++){
            randomNum += (int) (Math.random() * 10);
        }
        return randomNum;
    }
}
