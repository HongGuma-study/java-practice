package online.java.objects;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo(){
        System.out.println(busNumber + "의 승객 수 는 "+passengerCount+" 명 입니다.");
    }
}
