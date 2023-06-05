package project.classb.dancer;

public class Dancer {
    public String name;

    public Dancer(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(toString());
    }

    public String toString() {
        return String.format("Dancers %s are printed from inside Dance class", name);
    }
}
