package com.USCapitals;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/** Store the pairs of each state and its capital in a Map using the
 * HashMap function. Display the content of the Map, then use the
 * TreeMap class to sort the map while using a binary search tree
 * for storage. The program will prompt the user to enter
 * a state and it will then display the capital for the state.
 */

 public class Part2 {
     public static void main(String[] args) {
         Map<String, String> printMap = insertArrayDataToMap();
         Scanner userInput = new Scanner(System.in);

         for (Map.Entry<String, String> entry : printMap.entrySet()) {
             System.out.println(entry.getValue() + ", " + entry.getKey());
         }
         while (true) {
             System.out.println("Please enter the State (type exit to stop):");
             String input = userInput.nextLine();
             if (printMap.containsKey(input)) {
                 System.out.println("The capital of " + input + " is " + printMap.get(input));
             } else if (input.equalsIgnoreCase("exit")){
                 Runtime.getRuntime().halt(0);
             } else {
                 System.out.println("That's not a valid state. States are case sensetive");
             }
         }
     }

     public static Map<String, String> insertArrayDataToMap() {
         Map<String, String> capitalsMap = new HashMap<>();

         for (int i = 0; i < capitals.length; i++) {
             capitalsMap.put(capitals[i][0], capitals[i][1]);
         }
         return capitalsMap;
     }

     public static void sortHashMap() {
         TreeMap<String, String> sortHashMap = new TreeMap<>();
         Map<String, String> unsortedCapitalsMap = insertArrayDataToMap();
         sortHashMap.putAll(unsortedCapitalsMap);

     }

    private static String[][] capitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Maryland", "Annapolis"},
            {"Minnesota", "Saint Paul"},
            {"Iowa", "Des Moines"},
            {"Maine", "Augusta"},
            {"Kentucky", "Frankfort"},
            {"Indiana", "Indianapolis"},
            {"Kansas", "Topeka"},
            {"Louisiana", "Baton Rouge"},
            {"Oregon", "Salem"},
            {"Oklahoma", "Oklahoma City"},
            {"Ohio", "Columbus"},
            {"North Dakota", "Bismark"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"New Jersey", "Trenton"},
            {"New Hampshire", "Concord"},
            {"Nevada", "Carson City"},
            {"Nebraska", "Lincoln"},
            {"Montana", "Helena"},
            {"North Carolina", "Raleigh"},
            {"Missouri", "Jefferson City"},
            {"Mississippi", "Jackson"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
    };
}

