package project.classb;

import java.util.ArrayList;
import java.util.HashMap;

import project.classb.dancer.Dancer;
import project.classb.data.DancerSchool;

public class DancerCollection {
    public DancerSchool danceSchool;
    public HashMap<String, Dancer> dancers;

    public DancerCollection(ArrayList<String> dancerNames){
        danceSchool = new DancerSchool();
        dancers = new HashMap<String, Dancer>();
        for (String name : dancerNames) {
            Dancer temp = new Dancer(name);
            danceSchool.addDancer(temp);
            if (dancers.putIfAbsent(name, temp) != null) {
                System.err.println(String.format("Dancer %s already added", name));
            }
        }
    }

    public void addDancer(Dancer d){
        danceSchool.addDancer(d);
        if (dancers.putIfAbsent(d.name, d) != null) {
            System.err.println(String.format("Dancer %s already added", d.name));
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder("From DancerCollection: \n");
        s.append("\t"+danceSchool.toString());
        s.append("\n\nAll dancers\n\t");
        for (Dancer dancer : dancers.values()) {
            s.append(dancer.toString());
        }
        return s.toString();
    }

    public void print(){
        System.out.println(toString());
    }
}
