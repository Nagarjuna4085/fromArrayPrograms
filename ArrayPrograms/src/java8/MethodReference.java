package java8;

import java.util.stream.Stream;

public class MethodReference {
	public MethodReference() {

	}

	public static void main(String[] args) {

		Stream<Integer> list;
		// TODO Auto-generated constructor stub
		MyInterface1 t = new MyInterface1() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println(" from anonymus class priting.......");

			}
		};

		t.print();

		MyInterface1 u = () -> {

			// TODO Auto-generated method stub
			System.out.println(" from anonymus class priting.......");

		};

		u.print();

		MyInterface1 m = () -> Greeting.greet();

		m.print();

		MyInterface1 m2 = Greeting::greet;
		m2.print();

		// implement interface method using lamba expressino

		MyInterface2 m02 = (int n, int n1) -> n + n1;

		System.out.println(m02.sum(3, 5));

		// lets implement above using method reference -> implement the functional
		// interface using thr methos reference

		MyInterface2 methodRe = (int a, int b) -> MathUtil.add(a, b);

		System.out.println(methodRe.sum(30, 40));

		MyInterface2 methodRe1 = MathUtil::add;

		System.out.println(methodRe1.sum(30, 30));

	}

}
