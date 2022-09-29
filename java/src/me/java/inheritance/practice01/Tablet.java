package me.java.inheritance.practice01;

import java.util.Objects;

public class Tablet {
    boolean hasPencil;

    public Tablet(boolean hasPencil){
        this.hasPencil = hasPencil;
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tablet tablet = (Tablet) o;
        return hasPencil == tablet.hasPencil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPencil);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "hasPencil=" + hasPencil +
                '}';
    }
}
