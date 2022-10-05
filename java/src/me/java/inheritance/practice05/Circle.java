package me.java.inheritance.practice05;

import java.util.Objects;

public class Circle extends Shape implements GeometricController{
    public final double PI = 3.14;
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Point centerPoint, int radius) {
        super(centerPoint);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(Circle.class.getName() + " draw()");
    }

    @Override
    public double calculateArea() {
        return this.radius * this.radius * PI;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public String translate(int dx, int dy) {
        this.centerPoint.setX(centerPoint.getX()+dx);
        this.centerPoint.setY(centerPoint.getY()+dy);
        return "("+this.centerPoint.getX()+", "+this.centerPoint.getY()+")";
    }

    @Override
    public String scale(int offset) {
        this.radius += offset;
        return "radius = " + this.radius;
    }
}
