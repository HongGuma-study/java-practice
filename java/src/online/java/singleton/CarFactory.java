package online.java.singleton;

/**
 * 싱글톤 패턴
 */
public class CarFactory {
    private CarFactory() {} //private 생성자 선언
    private static CarFactory instance = new CarFactory(); // 유일한 인스턴스 private 로 생성

    /**
     * 외부에서 유일하게 참조할 수 있는 public 메서드 제공
     * @return 인스턴스 리턴
     */
    public static CarFactory getInstance(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(){
        return new Car();
    }
}
