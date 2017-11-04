package testQuest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test { 
	public static void main (String[] args) { 
		
		String[] inputArray = {"a","b","b","b","c"};
		System.out.println(getShrunkArray(inputArray, 3));
		
	}
	
	static String [] getShrunkArray(String [] inputArray, int burstLength){
		
		Arrays.sort(inputArray);
		List<String> inputList1 = Arrays.asList(inputArray);
		
		LinkedList<String> inputList = new LinkedList<>(inputList1);
		
		Map<String, Integer> dupMap = new HashMap<>();
		
		
		for(String str : inputList){
			if(dupMap.containsKey(str)){
				dupMap.put(str, dupMap.get(str) + 1);
			}
			else
				dupMap.put(str, 1);
		}
		
		List<String> toRemove = new LinkedList<>();
		List<String> toKeep = new LinkedList<>();
		
		for(Map.Entry<String, Integer> entry : dupMap.entrySet()){
			if(entry.getValue() >= burstLength){
				//dupMap.remove(entry.getKey());
				toRemove.add(entry.getKey());
			}
			else
				toKeep.add(entry.getKey());
			
		}
		
		System.out.println("DupMap:"+dupMap);
		System.out.println("toKeep "+toKeep);
		System.out.println("toRemove "+toRemove);
		
		
		//inputList.retainAll(toKeep);
		System.out.println("shrinked "+ inputList.retainAll(toKeep));
		
		System.out.println("shrinked "+ inputList);
		
		String[] resultArr = new String[inputList.size()];
		
		
		return inputList.toArray(resultArr);
	}
}
