package me.java.inheritance.practice01;

import java.util.Objects;

//제품을 구매한 사람
public class User extends Member{
    private String electronicDevice;
    private String paymentPolicy;

    public User(String id, String pw, int phone, String email, int birth, String electronicDevice, String paymentPolicy) {
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
