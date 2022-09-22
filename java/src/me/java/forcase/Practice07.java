package me.java.forcase;

import java.util.Scanner;

/**
 * 김밥천국 문제
 */
public class Practice07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        int money = 0; //고객의 주머니

        System.out.printf("고객님의 소지금을 입력해주십시오 >> ");
        money = scanner.nextInt();
        System.out.println();
        System.out.println("메뉴를 선택해주세요.");
        System.out.println("================");
        System.out.println("1. 김밥 (2500)");
        System.out.println("2. 라면 (3000)");
        System.out.println("3. 떡볶이 (4000)");
        System.out.println("4. 돈까스 (5000)");
        System.out.println("5. 종료.");
        System.out.println("================");

        while(true){
            if(money < 2500){
                System.out.println("김밥 천국 이용 불가. 소지금액이 2500원 이하 입니다.");
                break;
            }
            System.out.printf("메뉴 주문 번호 : ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    if(money >= 2500){
                        System.out.println("김밥을 선택하셨습니다.");
                        money -= 2500;
                        System.out.printf("잔액은 %d 원 입니다.\n",money);
                    }else{
                        System.out.println("구매불가. 소지금이 부족합니다.");
                    }
                    break;
                case 2:
                    if(money >= 3000){
                        System.out.println("라면을 선택하셨습니다.");
                        money -= 3000;
                        System.out.printf("잔액은 %d 원 입니다.\n",money);
                    }else{
                        System.out.println("구매불가. 소지금이 부족합니다.");
                    }
                    break;
                case 3:
                    if(money >= 4000){
                        System.out.println("떡볶기를 선택하셨습니다.");
                        money -= 4000;
                        System.out.printf("잔액은 %d 원 입니다.\n",money);
                    }else{
                        System.out.println("구매불가. 소지금이 부족합니다.");
                    }
                    break;
                case 4:
                    if(money >= 5000){
                        System.out.println("돈까스를 선택하셨습니다.");
                        money -= 5000;
                        System.out.printf("잔액은 %d 원 입니다.\n",money);
                    }else{
                        System.out.println("구매불가. 소지금이 부족합니다.");
                    }
                    break;
                case 5:
                    System.out.println("김밥 천국 종료. 이용해주셔서 감사합니다.");
                    break;
                default:
                    System.out.println("메뉴 선택 오류. (1~5번의 메뉴만 입력해주세요.)");
            }
            if(menu == 5) break;
        }

    }
}
