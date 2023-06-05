package project.classb.data;

import java.util.ArrayList;

import project.classb.dancer.Dancer;

public class DancerSchool {
    ArrayList<Dancer> dancers;
    
    public DancerSchool(){
        dancers = new ArrayList<Dancer>(); 
    }

    public void addDancer(Dancer d) {
        dancers.add(d);
    }

    public void printAll() {
        System.out.println(toString());
    }


    public String toString(){
        StringBuilder s = new StringBuilder("From DanceData: ");
        for (Dancer dancer : dancers) {
            s.append(dancer.toString());
        }
        return s.toString();
    }

}
