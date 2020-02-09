import java.util.Arrays;
import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int capacity = 0;
		double[] data = {4758.806, 5795.711, 5014.683, 7701.312, 3246.816,
				6989.659, 5027.265, 7440.575, 3019.995, 7241.105, 7696.65,
				7098.486, 4367.961, 5519.468, 2894.973, 7202.648, 6443.892,
				3033.452, 3223.899, 6697.127, 4898.63, 2467.281, 2487.543,
				5172.012, 3455.382, 7849.135, 3166.272, 4926.252, 7524.989,
				7755.748, 6438.85, 5302.584, 5458.334, 5804.818, 3185.936,
				5759.344, 7182.593, 7735.632, 6649.255, 6619.317, 5909.641,
				6634.304, 7318.31, 2923.583, 5803.122, 6958.059, 5218.86,
				6094.804, 3096.456, 4922.01, 7275.775, 3607.358,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0};

		for (int i=0; i<data.length; i++)
			capacity = capacity + 1;

//Prints Capacity and Reversed Array
		System.out.println(capacity);
		System.out.println("The array reversed is " + dataReverse(data));

//Prompts Insert Method
		System.out.println("Would you like to insert data? (type 'yes' or 'no')");
		String response1 = scan.nextLine();
		if (response1.equals("yes"))
			System.out.println(dataInsert(data));
		else if (response1.equals("no"))
			System.out.println("Ok");
		else
			System.out.println("Error");
//Prompts Delete Method
		System.out.println("Insertion successful. Would you like to delete data? (type 'yes' or 'no')");
		String response2 = scan.nextLine();
			if (response2.equals("yes"))
				System.out.println("Deletion successful. You deleted " + dataDelete(data) + ".");
		else if (response2.equals("no"))
			System.out.println("Ok");
		else
			System.out.println("Error");
	}
//Reverse, Insert, and Delete Methods
	public static String dataReverse(double[] data) {
		double[] dataReverse = new double[data.length];
		for (int i=0; i<=data.length-1; i++) {
			int x = data.length-1;
			dataReverse[x] = data[i];
			x--;
		}
		return Arrays.toString(dataReverse);
	}
	public static String dataInsert(double[] data) {
		Scanner scan = new Scanner(System.in);
		System.out.println("'Double to insert'\nPRESS ENTER\n'Index to insert it in'");
		double value = scan.nextDouble();
		int index = scan.nextInt();

		data[index] = value;
		return Arrays.toString(data);
	}
	public static double dataDelete(double[] data) {
		Scanner scan = new Scanner(System.in);
		double value;
		System.out.println("Enter index point of the element you want to remove:");
		int index = scan.nextInt();
		value = data[index];
		data[index] = 0.0;

		return value;
	}
}