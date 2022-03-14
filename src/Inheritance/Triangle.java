package Inheritance;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(int base, int height, String text, String material) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight() {
        System.out.println("Triangle height is: " + this.height);
    }

    @Override
    public int getSize() {
        super.getSize();
        int size = (this.base * this.height) / 2;
        return size;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + this.height + " ,base is: " +
                this.base + super.toString();
    }


}

