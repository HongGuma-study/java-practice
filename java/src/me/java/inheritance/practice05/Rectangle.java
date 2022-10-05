package me.java.inheritance.practice05;

import java.util.Objects;

public class Rectangle extends Shape implements GeometricController{
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point centerPoint, int width, int height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(Rectangle.class.getName() + " draw()");
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
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
        this.height += offset;
        this.width += offset;
        return "height = "+this.height+", width = "+this.width;
    }
}
