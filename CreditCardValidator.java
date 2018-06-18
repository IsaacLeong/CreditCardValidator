public class CreditCardValidator {
	public static void main(String[] args) {
		// Takes in a credit card number from a common credit card vendor (Visa, MasterCard, American Express, Discover) 
		// and validates it to make sure that it is a valid number
		// Validate cards using Luhn Algorithm
		
		// take credit card as string and split into char array
		String test = "4111111111111111";
		String[] array = test.split("");
		int[] digits = new int[array.length];
		
		// convert string into int for luhn algorithm
		for(int i = 0; i < array.length; i++) {
			digits[i] = Integer.parseInt(array[i]);
		}
		
		// luhn algorithm
		int sum = 0;
		for(int i = 0; i < digits.length; i++) {
			if(i%2 == 0) {
				digits[i] = digits[i] * 2;
				if(digits[i] > 9) {
					digits[i] = digits[i] - 9;
				}
				sum += digits[i];
			}
			else {
				sum += digits[i];
			}
		}
		System.out.println(sum);
		
		// validate luhn algorithm
		if(sum % 10 == 0) {
			System.out.println("CC is valid");
		}
		else {
			System.out.println("CC is not valid");
		}
	}
}
