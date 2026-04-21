package multithreading;


class Mythread extends Thread{
	public void run() {
		System.out.println("Thread id running");
	}
	
}

public class ThreadClass  {


	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		t1.start();

	}

}
