package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Count count = new Count();

//		for(int i=0;i<10000;i++) {
//			count.increament();
//		}
//		
//		for(int i=0;i<10000;i++) {
//			count.increament();
//		}

		Thread t1 = new Thread(() -> {

			for (int i = 0; i < 10000; i++) {
				count.increament();
			}
		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 10000; i++) {
				count.increament();
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("final count:  " + count.count);
	}
}
