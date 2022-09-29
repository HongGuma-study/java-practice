package me.java.inheritance.practice01;

import java.util.Objects;

//구매자의 정보
public class Member {
    public static int serialNo=0;
    private int memberSerialNo;
    protected String memberID;
    protected String memberPassword;
    protected int memberPhoneNumber;
    protected String memberEmail;
    protected int memberBirthDate;

    public Member(String id, String pw, int phone, String email, int birth){
        serialNo++;
        this.memberSerialNo = serialNo;
        this.memberID = id;
        this.memberPassword = pw;
        this.memberPhoneNumber = phone;
        this.memberEmail = email;
        this.memberBirthDate = birth;
    }

    public int getMemberSerialNo() {
        return memberSerialNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public int getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(int memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public int getMemberBirthDate() {
        return memberBirthDate;
    }

    public void setMemberBirthDate(int memberBirthDate) {
        this.memberBirthDate = memberBirthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberSerialNo == member.memberSerialNo && memberPhoneNumber == member.memberPhoneNumber && memberBirthDate == member.memberBirthDate && Objects.equals(memberID, member.memberID) && Objects.equals(memberPassword, member.memberPassword) && Objects.equals(memberEmail, member.memberEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberSerialNo, memberID, memberPassword, memberPhoneNumber, memberEmail, memberBirthDate);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberSerialNo=" + memberSerialNo +
                ", memberID='" + memberID + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberPhoneNumber=" + memberPhoneNumber +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBirthDate=" + memberBirthDate +
                '}';
    }

}
