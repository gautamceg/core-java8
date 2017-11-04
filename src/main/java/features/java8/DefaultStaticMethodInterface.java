package features.java8;

interface Interface1{
	public void something();
	default void foo(){
		System.out.println("Interface1 foo");
	}
	static void bar(){
		System.out.println("Interface1 bar");
	}
}

interface Interface2{
	public void something();
	default void foo(){
		System.out.println("Interface2 foo");
	}
	static void bar(){
		System.out.println("Interface3 bar");
	}
}

class Child implements Interface1, Interface2{

	@Override
	public void something() {
		System.out.println("Child doing something");
		
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		//Interface1.super.foo();
		System.out.println("Child foo");
	}
	
}

public class DefaultStaticMethodInterface {

	public static void main(String[] args) {
		Child c = new Child();
		c.foo();
		Interface1.bar();
	}

}
