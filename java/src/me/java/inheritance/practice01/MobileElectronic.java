package me.java.inheritance.practice01;

import java.util.Objects;

public class MobileElectronic {
    private CommunicationMethod communicationMethod;
    private float weight;

    public MobileElectronic(CommunicationMethod communicationMethod, float weight){
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public CommunicationMethod getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(CommunicationMethod communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileElectronic that = (MobileElectronic) o;
        return Float.compare(that.weight, weight) == 0 && communicationMethod == that.communicationMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(communicationMethod, weight);
    }

    @Override
    public String toString() {
        return "MobileElectronic{" +
                "communicationMethod=" + communicationMethod +
                ", weight=" + weight +
                '}';
    }
}
