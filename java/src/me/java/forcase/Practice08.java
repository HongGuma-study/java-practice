package me.java.forcase;

/**
 * - 아래의 코드는 `무한루프`를 발생시킨다.
 * - `무한루프`가 발생하지 않도록 오류를 찾아 해결하시오.
 */
public class Practice08 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; // 추가함
        }
        int k = 1;
        int l = 1; // 위치를 바꿈
        while (k <= 5) {
            while (l <= 5) {
                System.out.print("*");
                l++; //위치를 바꿈
            }
            System.out.printf("0");
            k++;
        }
    }
}
