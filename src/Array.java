import java.util.*;

public class Array {
	public static void main(String [] args) {
		System.out.println("Hello world!");
		
		ArrayList<Integer> numbersGiven = new ArrayList<Integer>(
				Arrays.asList(5, 10, 15, 20));
		
		System.out.println(numbersGiven);
		
		Integer sum = 0;
		
		for (Integer number : numbersGiven) {
			sum = sum + number;
		}
		System.out.printf("The sum of the numbers given is: %d.\n", sum);
		
	}
	
}
