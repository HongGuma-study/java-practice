package online.java.singleton;

public class Car {
    public static int serialNum = 10000;
    private int carNum;

    public Car(){
        serialNum++;
        this.carNum = serialNum;
    }
    public int getCarNum(){
        return carNum;
    }
}
