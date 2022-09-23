package me.java.forcase;

/**
 * - 삼각형이 성립할 수 있는 조건은 `a + b > c (가장 긴변)` 이다.
 * - 삼각형이 될 수 있는 `1 ≤ a, b, c ≤ 100` 정수 중 피타고라스를 만족하는  (a, b, c) 쌍의 개수를 구하시오.
 */
public class Practice05 {
    public static void main(String[] args) {
        int cnt = 0;
        for(int i=1; i<=100; i++){
            for(int j=1; j<=100; j++){
                for(int k=1; k<=100; k++){
                    if(i+j > k){
                        if(i<j && (Math.pow(k,2) == (Math.pow(i,2)+Math.pow(j,2)))) cnt++;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(cnt+"개");
    }
}
