package assesment;

class MyException extends Exception
{
    public MyException(String s) 
    {
        super(s);
    }

}

public class FirstAndLastName 
{
	 String checkName(String firstName,String lastName)throws MyException
	 {
		 if(firstName.trim().isEmpty() || lastName.trim().isEmpty())
		 {
			 throw new MyException("First Name and Last Name ");
		 }
		 
		 else
		 {
		 return firstName + lastName;
		 }
    }
	
	public static void main(String[] args) 
	{
		FirstAndLastName v = new FirstAndLastName();
        
        try 
        {
            System.out.println(v.checkName("Sakthi", "Rohini"));
        } 
        catch (MyException e)
        {
            System.out.println(e.getMessage());
        
        }
   }

}
