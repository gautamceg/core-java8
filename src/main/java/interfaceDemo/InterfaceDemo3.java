package interfaceDemo;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface A{
	default void log(String str){
		System.out.println("A "+str);
	}
	default void show(){
		System.out.println("Just showing");
	}
}

interface B{
	default void log(String str){
		System.out.println("B "+str);
	}
	default void show(){
		System.out.println("Just showing");
	}
	
}

class Impl implements A,B{

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		A.super.log(str);
		System.out.println("Helllllllllllllllllo");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		B.super.show();
	}
	
}
