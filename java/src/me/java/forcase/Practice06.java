package me.java.forcase;

/**
 * - 별찍기
 * - `중첩 for문`을 이용하여 아래의 그림처럼 별을 찍는 프로그램을 출력하시오.
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */
public class Practice06 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){ //줄
            for(int j=4; j>i; j--){//공백
                System.out.printf(" ");
            }
            for(int k=0; k<i+1; k++){//별
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
