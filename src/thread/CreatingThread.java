package thread;

public class CreatingThread implements Runnable {

	public static void main(String[] args) {
		
		Thread T1 = new Thread("Sakthi");
		Thread T2 = new Thread(" Rohini");
		T1.start();
		T2.start();
		System.out.print(T1.getName());
		System.out.print(T2.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
