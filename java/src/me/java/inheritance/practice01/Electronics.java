package me.java.inheritance.practice01;


public class Electronics {
    Electronic[] electronics = new Electronic[10];

    public Electronics(){
        for(int i=0; i<10; i++){
            electronics[i] = new Electronic("model-"+i,CompanyType.values()[ i % CompanyType.values().length],"2022-10-01",
                    AuthMethod.values()[ i % AuthMethod.values().length]);
        }
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
     * @param companyType 회사 타입
     * @return
     */
    public Electronic[] groupByCompanyName(CompanyType companyType){
        Electronic[] result = {};
        int count = 0;
        for(Electronic electronic : this.electronics){
            if(electronic.getCompanyName().equals(companyType)){
                count++;
            }
        }
        result = new Electronic[count];

        int i=0;
        for(Electronic electronic : this.electronics){
            if(electronic.getCompanyName().equals(companyType)){
                result[i] = electronic;
                i++;
            }
        }

        return result;
    }


}
