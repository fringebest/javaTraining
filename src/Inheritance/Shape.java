package Inheritance;

import java.awt.*;

public class Shape {

    private String text;
    private String material;

    public Shape (){}
    public Shape (String text,String material) {
        this.text = text;
        this.material = material;
    }

    public int getSize(){
        return -1;
    }

    @Override
    public String toString(){
        return "mode of" + this.material + " contains the text:" + this.text;
    }
}
