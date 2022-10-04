package me.java.inheritance.practice01;

import java.util.Objects;

//제품을 구매한 사람
public class User extends Member{
    private String electronicDevice;
    private String paymentPolicy;

    public User(String id, String pw, String phone, String email, int birth, String electronicDevice, String paymentPolicy) {
        super(id, pw, phone, email, birth);
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    }

    public String getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(String electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    /**
     * practice04
     * @param candidates :랜덤 생성된 번호 후보군
     * @return : 사용자가 선택한 전화 번호
     */
    public String getNewPhoneNumber(String[] candidates){
        int priority = 10; //우선순위 (규칙에 따라 우선순위가 달라서)
        String newNumber = ""; //사용자가 선택할 폰번호
        String oldNumber = this.memberPhoneNumber.replaceAll("-",""); //기존 폰 번호
        for(String candidate : candidates){ //candidates 배열에서 하나씩 꺼내 씀
            candidate = candidate.replaceAll("-",""); //어떤 입력이 들어올지 몰라서 - 다 뺐음
            if(equalsTwoNumber(candidate,oldNumber)){//연속된 숫자 2개만 다름
                if(priority > 1){ //priority 가 1 초과 일때만 (priority 가 1이라는 소리는 이전 candidate 에서 이미 해당 작업을 수행앴음)
                    priority = 1; //priority 를 1로 바꾸고
                    newNumber = candidate.substring(0,3)+"-"+candidate.substring(3,7)+"-"+candidate.substring(7); //예쁘게 출력하려고 - 넣음
                }
            }else if(candidate.substring(3,7).equals(oldNumber.substring(3,7))){ //중간 4개 숫자가 동일함
                if(priority > 2){ //priority 가 1인 경우는 앞에서 이미 높은 우선순위의 규칙을 만났다는 소리 밑에 작업 할 필요 없음
                    priority = 2;
                    newNumber = candidate.substring(0,3)+"-"+candidate.substring(3,7)+"-"+candidate.substring(7);
                }
            }else if(candidate.substring(7).equals(oldNumber.substring(7))){ // 마지막 4개 숫자가 동일함
                if(priority > 3){ //이하동문
                    priority = 3;
                    newNumber = candidate.substring(0,3)+"-"+candidate.substring(3,7)+"-"+candidate.substring(7);
                }
            }else if(equalsNumber(candidate,oldNumber)){ // 무작위 3개 숫자만 다름
                if(priority > 4){ //이하동문
                    priority = 4;
                    newNumber = candidate.substring(0,3)+"-"+candidate.substring(3,7)+"-"+candidate.substring(7);
                }
            }else{
                if(priority > 5){ //priority 가 5 이상이라는 소리는 위 규칙중 아무것도 해당 사항이 없다는 소리
                    newNumber = oldNumber.substring(0,3)+"-"+oldNumber.substring(3,7)+"-"+oldNumber.substring(7);
                }
            }
        }
        return newNumber;
    }

    /**
     * 연속된 두자리 숫자 비교하는 함수
     * @param num1 번호 후보군
     * @param num2 기존 번호
     * @return 연속된 두자리만 다르고 나머지 같으면 true 아니면 false
     */
    private boolean equalsTwoNumber(String num1, String num2){
        int cnt = 0;
        //연속된 숫자 2개만 달라야하기 때문에 2개만 다른건지 개수 체크 (2개가 아니면 무조건 false임)
        for(int i=0; i<num1.length(); i++){
            if(num1.charAt(i) != num2.charAt(i)){
                cnt++;
            }
        }
        if(cnt == 2){ //개수가 2개이면 그게 연속되었는지 판단
            for(int i=0; i<num1.length()-1; i++){
                if(num1.charAt(i) != num2.charAt(i)){
                    return num1.charAt(i + 1) != num2.charAt(i + 2);
                }
            }
            return false;
        }else{
            return false;
        }

    }

    /**
     * String으로 된 숫자 비교하는 함수
     * @param num1 번호 후보군
     * @param num2 기존 번호
     * @return 아무거나 3개만 다르면 true 이하거나 이상이면 false
     */
    private boolean equalsNumber(String num1, String num2){
        int cnt = 0;
        //아무거나 3개만 다르면됨
        for(int i=0; i<num1.length(); i++){
            if(num1.charAt(i) != num2.charAt(i)){
                cnt++;
            }
        }
        return cnt == 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(electronicDevice, user.electronicDevice) && Objects.equals(paymentPolicy, user.paymentPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electronicDevice, paymentPolicy);
    }

    @Override
    public String toString() {
        return "User{" +
                "electronicDevice='" + electronicDevice + '\'' +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                ", memberID='" + memberID + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberPhoneNumber=" + memberPhoneNumber +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBirthDate=" + memberBirthDate +
                '}';
    }
}
