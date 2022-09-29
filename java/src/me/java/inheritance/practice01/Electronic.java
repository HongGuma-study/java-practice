package me.java.inheritance.practice01;

import java.util.Objects;

public class Electronic{
    public static int serialNo = 0;
    private int productNo;
    protected String modelName;
    public CompanyType companyName;
    protected String dateOfMade;
    public AuthMethod authMethod;

    public Electronic(String modelName, CompanyType companyName, String dateOfMade, AuthMethod authMethod){
        serialNo++;
        this.productNo = serialNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
//        Electronic(CompanyType.values()[i % CompanyType.values().length]); //enum 값 랜덤으로 받기
    }

    public static int getSerialNo() {
        return serialNo;
    }

    public static void setSerialNo(int serialNo) {
        Electronic.serialNo = serialNo;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CompanyType getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyType companyName) {
        this.companyName = companyName;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public AuthMethod getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethod authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronic that = (Electronic) o;
        return productNo == that.productNo && Objects.equals(modelName, that.modelName) && companyName == that.companyName && Objects.equals(dateOfMade, that.dateOfMade) && authMethod == that.authMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNo, modelName, companyName, dateOfMade, authMethod);
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "productNo=" + productNo +
                ", modelName='" + modelName + '\'' +
                ", companyName=" + companyName +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + authMethod +
                '}';
    }
}
