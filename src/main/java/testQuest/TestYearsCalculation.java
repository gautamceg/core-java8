package testQuest;

public class TestYearsCalculation {
    private static int NO_OF_MONTHS_PER_YEAR = 12;

    public static void main (String... args) {
    int months = 39;
    
    //float years = (months / NO_OF_MONTHS_PER_YEAR) + (float)(1/NO_OF_MONTHS_PER_YEAR) * (months % NO_OF_MONTHS_PER_YEAR); 
    
    float firstPart = (months / NO_OF_MONTHS_PER_YEAR); //3
    System.out.println(firstPart);
    float secondPart = (float)(1/NO_OF_MONTHS_PER_YEAR) * (months % NO_OF_MONTHS_PER_YEAR); //
    System.out.println(secondPart);

    System.out.println(((float)months)/NO_OF_MONTHS_PER_YEAR);


    float years = (months / NO_OF_MONTHS_PER_YEAR) + (float)(1/NO_OF_MONTHS_PER_YEAR) * (months % NO_OF_MONTHS_PER_YEAR);

    if(years < 1) {
        years = 1;
    }
    
    System.out.println(years);
  }
}

/**
 * 3.0
0.0
3.25
3.0
*/
