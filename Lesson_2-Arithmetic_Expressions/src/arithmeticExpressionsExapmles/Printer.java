package arithmeticExpressionsExapmles;

public class Printer {
	
	public static void main(String[] args) {
		
		String part1 = "There will be ";
		int visitors = 5;
		String part2 = " people for dinner.";
		
		System.out.println(part1 + visitors + part2);
		//The expression inside the parentheses is considered as an arithmetic expression
		//instead of a + sign as a concatenation sign. The expression will be calculated
		//and the value will be converted to a string and will be concatenated.
		System.out.println(part1 + (visitors + 2) + part2);
		
	}

}

