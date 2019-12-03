package INTERMEDIATE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * implement Dictionary Application
 *
 * (Word - Meaning, Description)
 *
 *     Discuss how would you model the meaning and description in a single value of hashmap pair.
 *
 *     Demonstrate adding, searching, removing and printing of all key-value pairs.
 */
public class Start {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary  = new HashMap<>();

        ArrayList<String> animal = new ArrayList<>();
        animal.add("Animal");
        animal.add("any member of the kingdom Animals");
        dictionary.put("animal", animal);

        ArrayList<String> cat = new ArrayList<>();
        cat.add("Cat");
        cat.add("a small domesticated carnivore");
        /**
        * A carnivore, meaning "meat eater",
        * is an organism that derives its energy
        * and nutrient requirements from a diet consisting mainly or
        * exclusively of animal tissue, whether through predation or scavenging.
        *
        */
        dictionary.put("cat", cat);

        ArrayList<String> dog = new ArrayList<>();
        dog.add("Dog");
        dog.add("a domesticated canid");
        /**
         * The biological family Canidae is a lineage of carnivorans
         * that includes domestic dogs, wolves, coyotes, foxes, jackals, dingoes, and many other
         * extant and extinct dog-like mammals. A member of this family is called a canid
         */
        dictionary.put("dog", dog);

        System.out.println(dictionary.get("dog").get(0));

        for(Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " is a " + entry.getValue().get(0) + " that means it is "
                    + entry.getValue().get(1));
        }

        dictionary.remove("animal");

        System.out.println("******************");

        for(Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " is a " + entry.getValue().get(0) + " that means it is "
                    + entry.getValue().get(1));
        }
    }
}
