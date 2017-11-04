package testQuest;

class A {}
class B extends A {}
class C extends A {}
public class Cast {
	public static void main(String[] args) {
		
		/* insert statement here <br>
		A xx = new A();
		B yy = new B();
		xx=yy;
		yy=(B)xx;
		*/
		Integer x,xl = null,x2 = null,x3 = null,x4 = null,x5 = null,x6 = null,x7 = null,x8 = null,x9;
		
		x = 0; 
		if (xl.hashCode() != x2.hashCode())
			x = x + 1; 
		if (x3.equals(x4)) 
			x = x + 10; 
		if (!x5.equals(x6)) 
			x = x + 100; 
		if (x7.hashCode() ==x8.hashCode())
			x = x + 1000; 
		System.out.println("x = " + x);
	}
}