package com.sg.foundations.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class StateCapitals {

    //final static String outputFilePath = "C:/Users/sreed/MthreeTrainingLearningJava\PracticeProgramming";
    public static void main(String[] args) throws Exception {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");

        //File file = new File(C:\Users\sreed\MthreeTraining\LearningJava\PracticeProgramming);

        out.println("STATES");
        out.println("==========");

        Set<String> keys = capitals.keySet();

        for (String k : keys) {
            out.println(k);
        }

        out.println("CAPITALS");
        out.println("==========");

        Collection<String> capValues = capitals.values();

        for (String c : capValues) {
            out.println(c);
        }

        //PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"));

        out.println("50 STATE AND CAPITALS ARE LOADED");

        out.println("=================================");
        out.flush();

        for (String k : keys) {
            out.println(k + " " + capitals.get(k));
        }
    }
}
