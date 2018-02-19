package by.vashkevich.bean;

public class B extends A {
	public int b = 3;

	public B() {
		this(8, 7);
		System.out.println("B");
	}

	//public B() {
		// super();
		//System.out.println("B");
	//}

	private B(int b, int a) {
		super("");
		this.b = b;

		System.out.println("B(a,b)");

	}
}