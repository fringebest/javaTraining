package Inheritance;

public class Teresstrial extends Animal {

    private int legs;
    private int eyes;

    public Teresstrial(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    @Override
    public String toString(){
        return "The terrestrial animal has: " + this.legs + " legs and " + this.eyes  + super.toString();
    }

    public void fight(){
        System.out.println("The terestrial animal is fighting now!");
    }

    public void move(int distance){
        System.out.println("This is the distance that animal runned " + distance);
    }

    public void saySomething(){
        System.out.println("Unknown animal for non-specific terestrial animal...");
    }

    public void getInfo(){
        System.out.println("All the info about animals " + legs + " ," + eyes);
    }

    public void camouflage(){System.out.println("All animal has camouflage shield"); }
}
