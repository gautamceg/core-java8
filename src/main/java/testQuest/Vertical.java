package testQuest;

public class Vertical { 
	private int alt; 
	public synchronized void up() { 
		++alt; 
		} 
	public void down() { 
		--alt; 
		} 
	public synchronized void jump() { 
		int a = alt; 
		up(); 
		down(); 
		assert(a == alt); 
	}
	public static void main(String[] args) {
		new Vertical().jump();
		System.out.println("dd");
	}
}
