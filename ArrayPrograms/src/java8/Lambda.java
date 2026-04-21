package java8;

public class Lambda {
	public Lambda() {

	}

	public static void main(String[] args) {

		System.out.println("main method started");
		Vehicle v = () -> {
			System.out.println("engine is started");
		};

		v.start();

		Calculator c = (int n1, int n2) -> n1 + n2;

		int res = c.sum(2, 3);
		System.out.println("sum is " + res);

	}

}
