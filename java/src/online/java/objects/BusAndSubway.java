package online.java.objects;

public class BusAndSubway {
    public static void main(String[] args) {
        Student studentA = new Student("김철수",10000);
        Student studentB = new Student("이영희",50000);
        Student studentC = new Student("강감찬",300000);
        Student studentD = new Student("홍길동",100000);
        Student studentE = new Student("심청이",5000);
        Student studentF = new Student("영심이",8500);

        Bus bus100 = new Bus(100);
        Bus bus101 = new Bus(101);
        Bus bus1401 = new Bus(1401);

        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);

        studentA.takeBus(bus100);
        studentB.takeBus(bus100);
        studentC.takeBus(bus101);
        studentD.takeSubway(subway1);
        studentE.takeSubway(subway2);
        studentF.takeBus(bus100);

        bus100.showBusInfo();
        bus101.showBusInfo();
        bus1401.showBusInfo();
        subway1.showSubwayInfo();
        subway2.showSubwayInfo();
    }
}
