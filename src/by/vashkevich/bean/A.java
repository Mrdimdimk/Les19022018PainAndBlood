package by.vashkevich.bean;

public class A {
	private int a = 1;

//	public A() {
//		super();
//		System.out.println("A");
//	}
//	
	public A(String str){
		//this(4);
		System.out.println("Hi  " + str);
	}

	public A(int a) {
		this("Dima");
		this.a = a;
		System.out.println("A(a)");
	}

}
