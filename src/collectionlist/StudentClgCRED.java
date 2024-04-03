package collectionlist;

import java.util.ArrayList;

public class StudentClgCRED {

	public static void main(String[] args) {
		
		ArrayList<StudentClg> sc = new ArrayList<StudentClg>();
		StudentClg s = new StudentClg(1, "Sakthi", "MCA");
		StudentClg s1 = new StudentClg(2, "Rohini", "BCA");
		StudentClg s2 = new StudentClg(3, "Sugi", "MCA");
		
		sc.add(0, s2);
		sc.add(s);
		sc.add(s1);
		
		System.out.println("My Student List: " +sc);
		System.out.println("Total Number of Students: "+sc.size());
		sc.remove(1);
		System.out.println("After Remove My Student List: " +sc);
		
		
		System.out.println("Get After My Student List: " +sc.get(0));
		
	}

}
