package project.classa;

import java.util.ArrayList;
import java.util.Arrays;

import project.classb.DancerCollection;

class Main {
    public static void main(String[] args) {
        DancerCollection dc = new DancerCollection(new ArrayList<String>(Arrays.asList(new String[]{"Jason, Jack, Mike, Marsie, Morissa, Tina"})));

        dc.print();
    }
}