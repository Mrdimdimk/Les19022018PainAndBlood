package runner;

import by.vashkevich.bean.A;
import by.vashkevich.bean.B;
import by.vashkevich.bean.C;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A a = new A(89);

B b = new B();

A a =  new B();

Object obj = new A("");
Object[] array = new Object[]{new A(""), new B(), new C()};
A[] array2 = new A[]{new A("a"), new B()};

System.out.println();

	}

}
