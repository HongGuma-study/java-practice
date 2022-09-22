package me.java.forcase;

/**
 * - 우리가 가진 수는 `1, 2, 3, 4, 5`가 있다고 가정하자.
 * - 해당 수 내에서 발생할 수 있는 조합의 쌍과 수를 출력하는 프로그램을 작성하시오.
 */
public class Practice04 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=i+1; j<=5; j++){
                System.out.println("("+i+", "+j+")");
            }
        }
    }
}
