package me.java.inheritance.practice05;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Rectangle(3, 5), new Triangle(5, 3) };

        for (int i = 0; i < shapes.length; i++) {
            Point point = new Point((int)(Math.random()*10) + 1, (int)(Math.random()*10) + 1);
            shapes[i].setCenterPoint(point);
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getClass().getName() + " = " + shapes[i].calculateArea());
        }
    }

}