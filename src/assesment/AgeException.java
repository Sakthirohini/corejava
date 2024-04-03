package assesment;


	class MyException1 extends Exception
	{
	    public MyException1(String s) 
	    {
	        super(s);
	    }
	
	}
	public class AgeException 
	{
	    String validAge(int age) throws MyException1 
	    {
	        if(age<15) 
	        {
	            throw new MyException1("Age is smaller than 15");
	        }
	        else
	        {
	            return "Valid ";
	        }
	    }
	public static void main(String[] args) 
	{
		AgeException v = new AgeException();
		        
		        try 
		        {
		            System.out.println(v.validAge(24));
		        } 
		        catch (MyException1 e)
		        {
		            System.out.println(e.getMessage());
		        
		        }
	}
		}
	
