package thread;

class Table
{
	synchronized void PrintTable(int n)
	{
		for(int i =1; i<=12; i++)
		{
			System.out.println(i+" * "+n+" = "+i*n);
		}
	}
}
class Table1 extends Thread
{
 Table T = new Table();
 int n;
 public Table1(Table T, int n) 
 {
	this.T=T;
	this.n=n;
 }
 public void run() 
 {
	T.PrintTable(n);

 }
}
public class SyncronizedMultiThread {

	public static void main(String[] args)
	{
		
		Table T = new Table();
		
		Table1 T1 = new Table1(T,5);
		T1.start();
		
		Table1 T2 = new Table1(T,8);
		T2.start();
		
		Table1 T3 = new Table1(T,6);
		T3.start();
		
	}

}
