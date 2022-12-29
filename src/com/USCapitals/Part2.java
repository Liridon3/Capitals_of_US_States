package com.USCapitals;

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
         // use function to fill map from array
         Map<String, String> printMap = insertArrayDataToMap();
         //use function to create tree map
         TreeMap<String, String> sortedTreeMap = createTreeMap();
         Scanner userInput = new Scanner(System.in);

         //formatting display to print out hash map w/o sort
         System.out.println();
         System.out.println("---------------------------------------------");
         System.out.println("---State Capitals Hash Map Without Sorting---");
         System.out.println("---------------------------------------------");
         System.out.println();

         //prints the contents of the hash map w/o sort
         for (Map.Entry<String, String> entry : printMap.entrySet()) {
             System.out.println(entry.getValue() + ", " + entry.getKey());
         }
         System.out.println();

         //formatting display to print out tree map sorted
         System.out.println();
         System.out.println("----------------------------------------------");
         System.out.println("--------State Capitals Tree Map Sorted--------");
         System.out.println("----------------------------------------------");
         System.out.println();

         //prints the contents of the tree map sorted
         for (Map.Entry<String, String> entry : sortedTreeMap.entrySet()) {
             System.out.println(entry.getValue() + ", " + entry.getKey());
         }
         System.out.println();
         System.out.println();


         //true while loop with exit option in the body to continue asking the user for the State
         //if user enters an existing state, then display the capital
         //if user enters exit, stop the program and exit
         //else, let user know that the state doesn't exist and that it's case sensetive. It will loop to ask user to enter state again
         while (true) {
             System.out.println();
             System.out.println("----------------------------------------------");
             System.out.println("Please enter the State (type exit to stop):");
             String input = userInput.nextLine();
             if (printMap.containsKey(input)) {
                 System.out.println("The capital of " + input + " is " + printMap.get(input));
             } else if (input.equalsIgnoreCase("exit")){
                 System.out.println("Bye!");
                 Runtime.getRuntime().halt(0);
             } else {
                 System.out.println("That's not a valid state. States are case sensetive.");
             }
         }
     }

    //function to copy the array from part 1 to the hash map
     public static Map<String, String> insertArrayDataToMap() {
         Map<String, String> capitalsMap = new HashMap<>();

         for (int i = 0; i < capitals.length; i++) {
             capitalsMap.put(capitals[i][0], capitals[i][1]);
         }
         //returns map
         return capitalsMap;
     }

     //function to create tree map. Tree maps are always naturally sorted based on keys. States are the keys on the tree map
     public static TreeMap<String, String> createTreeMap() {
         //declare tree map
         TreeMap<String, String> capitalsTreeMap = new TreeMap<>();

         //declare and initialize map with states and capitals
         //user the insertArrayDataToMap() function to populate map
         Map<String, String> unsortedCapitalsMap = insertArrayDataToMap();

         //copy the map to the declared tree map above
         capitalsTreeMap.putAll(unsortedCapitalsMap);
         return capitalsTreeMap;
     }

    private static String[][] capitals = { //array of states and their capitals from Part 1
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

