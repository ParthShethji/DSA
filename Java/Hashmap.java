import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {
    // collision in hashing when 2 nos are trying to take same spot in hashtable
    // to slove this chaining problem
        // 1. chaining = put the address of the node in the hash table and then forming the chain. But the problem is to search the last element Time complexity is O(n). there are emoty space in hashtable then too we use space from outside


        //2.  Linear Probing - linearly goes into next row of hash table.
        //  hf = v%m, lp = (hf + i)%m, i is collisions and m is size.
        //   Again the time complexity to search is  O(n). 
        // Primary Clustering - when  2 data values with same key value follow the same path to get the final path in hashtable


        // 3. Quadratic Probing - hf = v%m, lp = (hf + c1i + c2i2)%m. There can be loss of data even if there is space available we cannot add bcoz the index of that type is not generated. Again the time complexity to search is  O(n).

        // 4. Double Hashing - hf =  (hf1(v) + i * hf2(v))%m, even here there is possibility of loss of data. Again the time complexity to search is  O(n).

    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        // functionality of the put() function
        hashmap.put(1, "Priya");
        hashmap.put(5, "Asha");
        hashmap.put(7, "Karan");
        hashmap.put(2, "Astha");

        System.out.println("HashMap of the given data is: "+hashmap);

        // functionality of the get() function
        String result = hashmap.get(3);
        System.out.println("Value for the given key is: "+result);

        // functionality of the containsKey() function
        System.out.println(hashmap.containsKey(2));

        // functionality of the remove() function
        hashmap.remove(1);
        System.out.println("Updated hashmap: "+hashmap);

        // iterating using the for loop
        for(Map.Entry<Integer, String> e: hashmap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }


        // LinkedHashmap - order on insertion is preserved
        LinkedHashMap<Integer,String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put(1, "Priya");
        hashmap1.put(5, "Asha");
        hashmap1.put(7, "Karan");
        hashmap1.put(2, "Astha");
        System.out.println("-----------------------------------------------------");
        for(Map.Entry<Integer, String> e: hashmap1.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        // Treemap - sorted on the basis of keys
        TreeMap<Integer,String> hashmap2 = new TreeMap<>();
        hashmap2.put(1, "Priya");
        hashmap2.put(5, "Asha");
        hashmap2.put(7, "Karan");
        hashmap2.put(2, "Astha");
                System.out.println("-----------------------------------------------------");

                for(Map.Entry<Integer, String> e: hashmap2.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
