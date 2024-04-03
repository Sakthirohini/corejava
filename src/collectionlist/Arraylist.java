package collectionlist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Sakthi");
		al.add("Rohini");
		al.add(null);
		al.add("Sugi");
		System.out.println("Array List:" +al);
		
		System.out.println("Using for loop" );
        for(String list:al) 
        {
            System.out.println(list);
        }
        
          al.remove(2);
          System.out.println("After Remove My Array list: " +al);
           
          System.out.println("Position of My Array list: " +al.get(1));
          
          al.set(2, "Sivasuki");
          
          System.out.println("After set My Array list: " +al);
          
          
          System.out.println("My arraylist size:"+al.size());

       
        ArrayList<String> anew=new ArrayList<>();
        System.out.println("anew list:"+anew);
        anew.addAll(al);
        System.out.println("My new arraylist1:"+anew);
        
        anew.clear();
        System.out.println("After Clear My new arraylist1:"+anew);
		
        ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		//al1.addFirst(78);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		System.out.println("Array List Interger:" +al1);

	}

}
