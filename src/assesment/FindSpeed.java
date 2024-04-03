package assesment;

import java.util.Scanner;

public class FindSpeed {
	
	    public static void calDistance(int t1 , int t2)
	     {
	       
	            int u = 10;
	             int a1= 5;
	             int distanceT1 = u*t1+((a1*t1*t1/2));
	             int distanceT2 = u*t2+((a1*t2*t2/2));
	             System.out.println(distanceT1);
	             System.out.println(distanceT2);
	       }
	    public int getSecondSmallest(int[] arr)
	       {
	    	 int temp;
	    	 for(int i=0;i<arr.length;i++)
	    	 {
	    	 for(int j=i+1;j<arr.length;j++)
	    	 {
	    	 if(arr[i]>arr[j])
	    	 {
	    	 temp = arr[i];
	    	 arr[i] = arr[j];
	    	 arr[j] = temp;
	    	 }
	    	 }
	    	 }
	    	 return arr[1];
	    	}
	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        
	         int t1=in.nextInt();
	         int t2=in.nextInt();
	         FindSpeed D = new FindSpeed();
	         D.calDistance(t1,t2);
	         int arr[]= {12, 45, 98, 34, 25};
	         int Array = D.getSecondSmallest(arr);
	         System.out.println(Array);
	     }
	        
	    }
	
