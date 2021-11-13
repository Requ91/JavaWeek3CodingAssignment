package codingAssignment;

public class CodingAssignment {

	public static void main(String[] args) {
		
		//Problem 1
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		System.out.println(ages[(ages.length - 1)] - ages[0]);
		
		double total = 0.0;
		double average;
		
		for(int num : ages) {
			total += num;
		}
		
		average = total / ages.length;
		System.out.println(average);
		
		//Problem 2
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double average2 = 0.0;
		
		for(String name : names) {
			total += name.length();
		}
		average2 = total / names.length;
		System.out.println(average2);
		
		//Problem 5
		int nameLengths[] = new int[names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Problem 6
		int sum = 0;
		
		for(int num : nameLengths) {
			sum += num;
		}
		System.out.println(sum);
		
		//Problem 7
		combineWords("hello", 3);

		//Problem 8
		fullName("John", "Smith");
		
		//Problem 9
		int testArray[] = {8, 55};
		isGreaterThan100(testArray);
		
		//Problem 10
		double testArray2[] = {8.0, 1.2, 11.4};
		averageOfDoubles(testArray2);
		
		//Problem 11
		double testArray3[] = {8.0, 1.2, 11.4, 12.0};
		greaterAverage(testArray2, testArray3);
		
		//Problem 12
		Boolean isHotOutside = false;
		double moneyInPocket = 10.51;
		willBuyDrink(isHotOutside, moneyInPocket);
		
		
		//Problem 13
		double cost = 749.99;
		double savings = 1000.00;
		System.out.println(canIAffordThis(cost, savings));
	}
	// Method for Problem 13
	// This method checks to see if a purchase costs more than half of the money in your
	// savings account to help save money.
	private static String canIAffordThis(double cost, double savings) {
		if((savings * 0.5) > cost) {
			return "You can afford this";
		}
		return "You cannot afford this";
	}
	// Method for Problem 12
	private static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && (moneyInPocket > 10.50)) {
			return true;
		}
		return false;
	}
	// Method for Problem 11
	private static Boolean greaterAverage(double[] testArray2, double[] testArray3) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		for(double num : testArray2) {
			sum1 += num;
		}
		for(double num : testArray3) {
			sum2 += num;
		}
		
		if((sum1 / testArray2.length) > (sum2 / testArray3.length)) {
			return true;
		}
		return false;
		
	}
	// Method for Problem 10
	private static double averageOfDoubles(double[] testArray2) {
		double sum = 0.0;
		for(double num : testArray2) {
			sum += num;
		}
		
		return sum / testArray2.length;
	}
	// Method for Problem 9
	private static Boolean isGreaterThan100(int array[]) {
		int sum = 0;
		for(int num : array) {
			sum += num;
		}
		if(sum > 100) {
			return true;
		}
		return false;
	}
	// Method for Problem 8
	private static String fullName(String first, String last) {
		String fullName = first + " " + last;
		
		return fullName;
	}
	// Method for Problem 7
	private static String combineWords(String word, int num) {
		String newWord = "";
		for(int i = 0; i < num; i++) {
			newWord = newWord + word;
		}
		return newWord;
		
	}
	
	

}
