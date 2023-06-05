package project.classa;

import java.util.ArrayList;
import java.util.Arrays;

import project.classb.DancerCollection;
import project.classb.dancer.Dancer;

class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Tammy");
        DancerCollection dc = new DancerCollection(new ArrayList<String>(Arrays.asList(new String[]{"Jason, Jack, Mike, Marsie, Morissa, Tina"})));

        dc.print();
    }
}