package features.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIterable {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<5; i++){
			list.add(i);
		}
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				System.out.println("Integer: "+i);
				
			}
		});
		
		list.forEach(System.out::println);

	}

}
