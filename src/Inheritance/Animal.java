package Inheritance;

public class Animal {

    String species;
    int size;


    @Override
    public String toString(){
        return  "The animal is a " + this.species + "; has a size of " + this.size ;
    }

}
