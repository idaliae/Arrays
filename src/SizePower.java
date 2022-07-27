import java.util.Scanner;

public class SizePower {

	public static int[] toPower(int size, int power) {
		int[] arr = new int[size];
		for (int i= 0; i < size; i++)
			arr[i] = (int)(Math.pow(i, power));
		return arr;
		
	}
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size integer:\n");
		int size = in.nextInt();
		
		System.out.println("Enter the power integer:\n");
		int power = in.nextInt();
		
		int[] res = toPower(size, power);
		for (int i= 0; i<size; i++)
			System.out.print(res[i] + " ");
	}
}


//Write a public static method called "toPower" that takes in as parameters two integers called size and power.
//The method should return an array of size "size" with each array index raised to the value of "power." 
//So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should return the following result: [0,1,4,9].