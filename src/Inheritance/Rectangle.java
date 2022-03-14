package Inheritance;

import java.util.ArrayList;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(int width, int height, String text, String material) {
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight() {
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public int getSize() {
        super.getSize();
        int size = this.width * this.height;
        return size;
    }

    @Override
    public String toString() {
        return "Rectangle: height is " + this.height + " width is: " + this.width + super.toString();
    }


    public static void main(String[] args) {

        Triangle triangle = new Triangle(1, 4, "I reflect light", "made of glass");
        Rectangle rectangle = new Rectangle(2, 4, "Yellow rectangle", "made of stell");

        ArrayList<Shape> shape = new ArrayList<Shape>();

        shape.add(triangle);
        shape.add(rectangle);

        for (int i = 0; i < shape.size(); i++) {
           System.out.println(shape.get(i).toString());
        }

    }
}
