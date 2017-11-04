package interfaceDemo;

public class InterfaceDemo1 implements I,J{

	public static void main(String[] args) {
		new InterfaceDemo1().show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I.super.show();
	}

}

interface I{
	default void show(){
		System.out.println("Show I");
	}
}
interface J{
	default void show(){
		System.out.println("Show J");
	}
}


