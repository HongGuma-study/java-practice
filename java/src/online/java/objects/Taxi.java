package online.java.objects;

/**
 * 복습해봅시다. 실습 코드
 */
public class Taxi {
    private String taxiName;
    private int income;

    public Taxi(String name){
        this.taxiName = name;
    }

    public void take(int charge){
        this.income += charge;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + "의 수입은 "+income+" 원 입니다.");
    }
}
