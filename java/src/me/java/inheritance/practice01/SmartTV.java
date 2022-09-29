package me.java.inheritance.practice01;

import java.util.Objects;

public class SmartTV {
    private float inch;

    public SmartTV(float inch){
        this.inch = inch;
    }

    public float getInch() {
        return inch;
    }

    public void setInch(float inch) {
        this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartTV smartTV = (SmartTV) o;
        return Float.compare(smartTV.inch, inch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inch);
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "inch=" + inch +
                '}';
    }
}
