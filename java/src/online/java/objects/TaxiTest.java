package online.java.objects;

public class TaxiTest {
    public static void main(String[] args) {
        Student studentA = new Student("김철수",10000);
        Student studentB = new Student("이영희",500000);
        Student studentC = new Student("강감찬",5000);

        Taxi taxiA = new Taxi("카카오택시");
        Taxi taxiB = new Taxi("마카롱택시");

        studentA.takeTaxi(taxiA,3800);
        studentA.takeTaxi(taxiB,4200);
        studentB.takeTaxi(taxiA,14200);
        studentB.takeTaxi(taxiB,5750);
        studentB.takeTaxi(taxiA,5750);
        studentC.takeTaxi(taxiA,3800);

        studentA.showMoney();
        studentB.showMoney();
        studentC.showMoney();

        taxiA.showTaxiInfo();
        taxiB.showTaxiInfo();
    }
}
