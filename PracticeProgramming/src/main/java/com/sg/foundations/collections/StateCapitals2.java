package com.sg.foundations.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitals2 {
    public static void main(String[] args) throws  Exception{
        //Create new HAshmap
        Map<String, String> capitals = new HashMap<>();
        //Key Value Pair
//        capitals.put("Kerala","Trivandrum");
//        capitals.put("Tamilnadu","Chennai");
//        capitals.put("Karnataka","Bangalore");
//        capitals.put("Maharashtra","Mumbai");

        Scanner sc = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        while (sc.hasNextLine()){
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
        System.out.println(capitals.size());
    }
}
