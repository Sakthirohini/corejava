package collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeListCRED {

	public static void main(String[] args) 
	{
		List < EmployeeList > c = new ArrayList < EmployeeList > ();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");
            ch = s.nextInt();
            switch (ch) {
                //Insert Operation
                case 1:
                	//insert();
                    System.out.print("Enter Empno : ");
                    int eno = s.nextInt();
                    System.out.print("Enter Empname : ");
                    String ename = s1.nextLine();
                    System.out.print("Enter Salary : ");
                    int salary = s.nextInt();
                    c.add(new EmployeeList(eno, ename, salary));
                    System.out.println("---------------------");
                    System.out.println("Record Inserted Sucessfully");
                    System.out.println("---------------------");
                    break;
                //Display Operation
                case 2:
                    System.out.println("---------------------");
                    Iterator < EmployeeList > i = c.iterator();
                    while (i.hasNext()) {
                    	EmployeeList e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("---------------------");
                    break;
                //Search Opeartion
                case 3:
                    boolean found = false;
                    System.out.print("Enter Empno to Search : ");
                    int empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                    	EmployeeList e = i.next();
                        if (e.getEId() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("---------------------");
                    break;
                //Delete Operation
                case 4:
                    found = false;
                    System.out.print("Enter Empno to Delete : ");
                    empno = s.nextInt();
                    System.out.println("---------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                    	EmployeeList e = i.next();
                        if (e.getEId() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                //Update Opeartion
                case 5:
                    found = false;
                    System.out.print("Enter Empno to Update : ");
                    empno = s.nextInt();
                    ListIterator < EmployeeList > li = c.listIterator();
                    while (li.hasNext()) {
                    	EmployeeList e = li.next();
                        if (e.getEId() == empno) {
                            System.out.print("Enter new Name : ");
                            ename = s1.nextLine();
                            System.out.print("Enter new Salary : ");
                            salary = s.nextInt();
                            li.set(new EmployeeList(empno, ename, salary));//update
                            found = true;
                        }
                    }
                    System.out.println("---------------------");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } 
                    else {
                        System.out.println("Record is Updated Sucessfully");
                    }
                    System.out.println("---------------------");
                    break;
                case 6:
                	System.exit(0);
                	break;
            }
        }
        while (ch != 0);
    }



	}


