package BASIC_A2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Implement Phonebook
 *
 * (Name - Number)
 *
 *     Demonstrate adding, searching, removing and printing of all key-value pairs.
 */
public class Start {

    public static void main(String[] args) {

        HashMap<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("John Doe", +4366012345678L);
        phoneBook.put("Jessica Alba", +436601212121L);
        phoneBook.put("John Wayne", +4366034123412L);
        phoneBook.put("Christian Ronaldo", +4366034523678L);
        phoneBook.put("Philip", +436608732498L);
        phoneBook.put("Wojckek", +4366018472489L);

        System.out.println();

        Iterator<Map.Entry<String, Long>> it = phoneBook.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Long> pair = (Map.Entry<String, Long>)it.next();
            if(pair.getValue().equals(+4367698012245L)){
                System.out.println(pair.getKey());
            }
        }
        phoneBook.remove("Christian Ronaldo");

        for(Map.Entry<String, Long> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
