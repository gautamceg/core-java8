package lambdaExpressions;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> process());
		t1.start();
		//method reference in Lambda
		Thread t2 = new Thread(MethodReferenceExample1 :: process);
		t2.start();
		

	}
	
	public static void process(){
		System.out.println("Hello !");
	}

}
