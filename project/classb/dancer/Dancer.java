package project.classb.dancer;

import project.DanceDress;
import project.classa.DanceShoe;

public class Dancer {
    public String name;
    public DanceShoe shoe;
    public DanceDress dress;

    public Dancer(String name) {
        this.name = name;
        shoe = new DanceShoe();
        dress = new DanceDress();
        System.out.println("From inside Dancer: "+shoe.getShoeString() + " and " +dress.getDressString());
    }

    public void print(){
        System.out.println(toString());
    }

    public String toString() {
        return String.format("Dancers %s are printed from inside Dance class", name);
    }
}
