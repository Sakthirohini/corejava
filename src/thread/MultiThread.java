package thread;

public class MultiThread extends Thread 
{
	private int num;
	MultiThread(int num)
	{
		this.num=num;
	}
	
	public void run()
	{
		int count = 0;
		int number = 0;
		do
		{
			number = (int)count;
			System.out.println(this.getName()+" Print "+number);
			count++;
		}
		while(number!=num);
		{
			System.out.println("It is Correct "+this.getName()+" Printed "+count+" times");	
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Starting Thread .....");
		Thread T = new MultiThread(20);
		T.start();
		try
		{
			T.join();
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Starting Interupted Exception");
		}
			System.out.println("Starting Next Thread .....");
			Thread T1 = new MultiThread(50);
			T1.start();
		

	}

}
