package testQuest;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SweetPickVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		int maxVote = Collections.max(voteMap.values());
		System.out.println("maxVote: "+maxVote);
		
		List<String> voteTieList = new LinkedList<>();
		for(Entry<String,Integer> entry : voteMap.entrySet()){
			if(entry.getValue() == maxVote)
				voteTieList.add(entry.getKey());
		}
		Collections.sort(voteTieList);
		String finalChoice = voteTieList.get(0);
		System.out.println("finalChoice: "+finalChoice);
		
		
	}

}
