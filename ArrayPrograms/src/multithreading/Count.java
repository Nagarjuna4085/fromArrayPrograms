package multithreading;

public class Count {
	int count = 0;

	synchronized void increament() {
		count++;
	}

}
