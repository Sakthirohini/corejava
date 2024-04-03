package assesment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoException {
	public static void main(String[] args)throws Exception 
    {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ur name");
        String name=br.readLine();
        System.out.println("Name : "+name);
        try {
            int a=10,b=2,c;
            c=a/b;
            int num[]= {1,2,3};
            //num[7]=40;
            String nm="pooja";
            //String nm=null;
            System.out.println("NAme length:"+nm.length());
            System.out.println("num:"+num[1]);
            System.out.println("Value of c: "+c);
        }
        catch(ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println(e);
        }
        catch(NullPointerException e1) {
            System.out.println(e1);
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2);
            
        }
   } 
}
