package testQuest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedMap {

	public static void main(String[] args) {
		String[] input = {"Gulab-Jamun", "Gulab-ras","Pera","Laddu","Laddu","Rasgulla","Rasgulla","Jalebi","Rasgulli","Rasgulli"};

		List<String> inputList = Arrays.asList(input);

		Map<String,Integer> voteMap = new HashMap<>();
		for(String str : inputList){
			if(voteMap.containsKey(str))
				voteMap.put(str, voteMap.get(str) + 1);
			else
				voteMap.put(str, 1);
		}
		System.out.println("voteMap: "+voteMap);
		List<Entry<String,Integer>> entryList = new LinkedList<>(voteMap.entrySet());

		Collections.sort(entryList, new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		Map<String,Integer> sortedMapByValue = new LinkedHashMap<>();

		for(Entry<String,Integer> entry : entryList){
			sortedMapByValue.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey()+ " : " +entry.getValue());
		}
		System.out.println("Sorted Map: "+sortedMapByValue);
		System.out.println(sortedMapByValue.get(0));
		
		//With Java8
		//ToDo:
		

	}

}
