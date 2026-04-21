package strings;

public interface ThreadSafe {

	public static void main(String[] args) throws InterruptedException {
		StringBuilder s1 = new StringBuilder();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				s1.append('a');

			}

		});
		
		
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				s1.append('a');

			}

		});
		
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Final length  " + s1.length());

	}

}
