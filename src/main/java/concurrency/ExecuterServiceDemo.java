package concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(10);
		Future<Integer> ft = es.submit(new DoSomething());
		es.shutdown();
		System.out.println("sleepDuration= "+ft.get());
		if(ft.isDone()){
			try {
				System.out.println("sleepDuration "+ft.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Thread t = new Thread(() -> {System.out.println("runninggggggg");});
		t.start();

	}
	
}
class DoSomething implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return print();
	}
	
	public Integer print() throws InterruptedException{
		int sleepDuration = new Random().nextInt(500);
		for(int i=0;i<5;i++){
			System.out.println(i);
			Thread.sleep(sleepDuration);
		}
		return sleepDuration;
	}
	
}
