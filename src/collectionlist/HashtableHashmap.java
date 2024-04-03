package collectionlist;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableHashmap {

	public static void main(String[] args) 
	{
		
		Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
        hash_table.put(1, "Monday");
        hash_table.put(2, "Tuesday");
        hash_table.putIfAbsent(3, "Sunday");
        System.out.println("hashtable: "+hash_table);
        System.out.println("Got: "+hash_table.get(2));
        
        
    
        
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//        hash_map.put(1, "Monday");
//        hash_map.put(2, "Tuesday");
//        hash_map.putIfAbsent(3, "Sunday");
//        System.out.println("hashmap: "+hash_map);
//        System.out.println("Got: "+hash_table.get(2));

	}

}
