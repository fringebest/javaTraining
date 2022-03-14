package Inheritance;

public class Rhino extends  Teresstrial{

    private String colour;

    public Rhino(int eyes, int legs){
        super(eyes,legs);
    }

    public Rhino(int eyes, int legs, String colour){
        super(eyes,legs);
        this.colour = colour;
    }

    public void horn(){
        System.out.println("I have a strong horn");
    }
    @Override
    public String toString(){
        return "This is a rhino" + super.toString();
    }

    @Override
    public void saySomething(){
        System.out.println("Vveerrsseee... This rhino says something... ");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Each animal has the following info: colour " + colour );
    }

    @Override
    public void camouflage(){
        super.camouflage();
        System.out.println("Rhino has the ability to hide");
    }
}
