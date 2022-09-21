package me.java.datatype;

public class FormChangePractice {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;
        System.out.println(num2);

        float num3 = num2; //float이 저장할 수 있는 정밀도가 오차가 있기 때문이다.
        num2 = (int) num3; //실수인 num3을 다시 int로 변환해서 num2에 넣음
        System.out.println(num3);
        System.out.println(num2); //num2의 숫자가 바뀜

        int result = num1 - num2;
        System.out.println(result);
    }
}
