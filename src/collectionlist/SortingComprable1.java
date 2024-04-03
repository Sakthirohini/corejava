package collectionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



	class Employeee implements Comparable<Employeee> 
	{
	    
	    private String name;
	    private int salary;
	    
	    public Employeee (String name, int salary) 
	    {
	        this.name = name;
	        this.salary = salary;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double getSalary() {
	        return salary;
	    }
	    
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    
	    @Override
	    public int compareTo(Employeee o) {
	        return this.name.compareTo(o.name);
	    }
	    @Override
	    public String toString() {
	        return "Employeee [name=" + name + ", salary=" + salary + "]";
	    }
	}
	public class SortingComprable1
	{
	    public static void main(String[] args)
	    {
	        ArrayList<Employeee> employees = new ArrayList<>((Arrays.asList(
	                new Employeee("Sakthi", 10000),
	                new Employeee("Rohini", 20000),
	                new Employeee("Sugi", 50000),
	                new Employeee("Anand", 45000))));
	        Collections.sort(employees);
	        for (Employeee e : employees)
	        {
	            System.out.println(e);
	        }
	    }
	   
	}

