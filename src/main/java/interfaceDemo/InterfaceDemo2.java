package interfaceDemo;

public class InterfaceDemo2 extends AA implements II{

	public static void main(String[] args) {
		new InterfaceDemo2().show();

	}
	@Override
	public void show(){
		System.out.println("In Interface Demo");
	}

}

