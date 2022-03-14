package Inheritance;

import java.util.ArrayList;

public class Tiger extends Teresstrial {

    private String colour;

    public Tiger(int eyes, int legs){
        super(eyes,legs);
    }

    @Override
    public String toString(){
        return "This is a tiger ." + super.toString();
    }

    public void agility(){
        System.out.println("I am a perfect hunter - agile and precise!");
    }

    @Override
    public void saySomething(){
        System.out.println("Ggggrrrr... This tiger says something...");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Each animal has the following info: colour " + colour );
    }

    @Override
    public void camouflage() {
        super.camouflage();
        System.out.println("Tiger has the ability to run and hide");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(4,6);
        Tiger tiger1 = new Tiger(4,8);
        Rhino rhino = new Rhino(2,4);
        Rhino rhino1 = new Rhino(3,4,"Black");

        ArrayList<Teresstrial> zoo = new ArrayList<Teresstrial>();

      zoo.add(tiger);
      zoo.add(tiger1);
      zoo.add(rhino1);
      zoo.add(rhino);

      for(int i = 0; i < zoo.size(); i++){
          zoo.get(i).saySomething();
      }

      for(Teresstrial i : zoo) {
         i.getInfo();

      }

      ArrayList<Teresstrial> zoo1 = new ArrayList<Teresstrial>();
      zoo1.add(tiger);
      zoo1.add(rhino1);

      for (int i = 0 ; i <zoo1.size(); i++ ){
          zoo1.get(i).camouflage();
      }

        for(int i = 0 ; i <zoo.size() ; i++){
            if(zoo.get(i) instanceof Rhino){
                Rhino rhinoRef = (Rhino)zoo.get(i);
                rhinoRef.horn();
            } else if (zoo.get(i) instanceof Tiger) {
                Tiger tigerRef = (Tiger)zoo.get(i);
                tigerRef.agility();
            } else {
                System.out.println("Error: Unknown kind of animal");
            }
        }

        System.out.println(tiger);
        System.out.println(rhino);
    }


}
