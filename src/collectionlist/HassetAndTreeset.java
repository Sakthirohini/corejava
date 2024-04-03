package collectionlist;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class HassetAndTreeset {

	public static void main(String[] args) {
		//<String> hs=new TreeSet<>();
        //No duplicates
        //Treeset-->outcome-->sorting->A to Z
        //A=65,a=97
        //HashSet
        HashSet<String> hs1=new HashSet<>();
        hs1.add("Sakthi");
        hs1.add("rohini");
        hs1.add("Harini");
        hs1.add("Sugi");
        
        
        TreeSet<String> hs=new TreeSet<>();
        hs.add("Sugi");
        hs.add("Sakthi");
        hs.add("anand");
        hs.add("Rohini");
        hs.add("sakthi");
    //    hs.add(null);
        
        
        System.out.println("HashSet hashcode:"+hs1.hashCode());
        System.out.println("Hash set:"+hs1);
        
        System.out.println("Tree hashcode:"+hs.hashCode());
        System.out.println("Tree set:"+hs);
        
        System.out.println("*****Using Enhanced for loop********");
        for(String i:hs) {
            System.out.println(i);
        }
        System.out.println("*****Using Iterator************");
        Iterator<String> i = hs.iterator();
        while(i.hasNext()) 
            System.out.println(i.next());
        System.out.println("*****Using decreding Iterator************");
        Iterator<String> i1 = hs.descendingIterator();
        while(i1.hasNext()) 
            System.out.println(i1.next());


	}

}
