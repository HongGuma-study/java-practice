package me.java.inheritance.practice01;


public class Electronics {
    int size = 0;
    Electronic[] electronics = {};

    public Electronics(){
        electronics = new Electronic[10];
        for(int i=0; i<10; i++){
            electronics[i] = new Electronic("model-"+i,CompanyType.values()[ i % CompanyType.values().length],"2022-10-01",
                    AuthMethod.values()[ i % AuthMethod.values().length]);
        }
    }

    public Electronics(int size){
        electronics = new Electronic[size];
    }

    public Electronics(Electronic[] electronics){
        this.electronics = electronics;
    }

    /**
     * practice02
     * @param productNo
     * @return
     */
    public Electronic findByProductNo(int productNo){
        for (Electronic electronic : this.electronics) {
            if (productNo == electronic.getProductNo()) {
                return electronic;
            }
        }
        return null;
    }

    /**
     * practice03
     * @return 각 그룹별로 분류가된 electronic 객체 배열
     */
    public Electronics[] groupByCompanyName(){
        Electronics[] result = new Electronics[3]; //0 : SAMSUNG, 1 : LG, 2 : APPLE
        Electronics tmp;

        int count = 0;
        int num = 0;

        for(CompanyType companyType : CompanyType.values()){
            for(Electronic electronic : this.electronics){
                if(electronic.getCompanyName().equals(companyType)){
                    count++;
                }
            }
            tmp = new Electronics(count);

            int i=0;
            for(Electronic electronic : this.electronics){
                if(electronic.getCompanyName().equals(companyType)){
                    tmp.electronics[i] = electronic;
                    i++;
                }
            }

            result[num] = tmp;
            num++;
        }


        return result;
    }


}
