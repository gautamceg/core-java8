package testQuest;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr[]={5,5,2,3,1,4};
		Arrays.sort(inputArr);
		int diff =0;
		int maxSoFar =0;
		int maxTotal =0;
		
		for(int i=0; i<inputArr.length-1; i++){
			if(inputArr[i] < inputArr[i++]){
				diff = inputArr[i] - inputArr[i++];
			}
			if(diff >= maxSoFar)
				maxSoFar = diff;
			if(maxSoFar > maxTotal)
				maxTotal = maxSoFar;
		}
		
		System.out.println(maxTotal);

	}

}
