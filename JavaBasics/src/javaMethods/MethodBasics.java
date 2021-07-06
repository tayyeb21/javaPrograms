package javaMethods;

public class MethodBasics {
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		
		if(n <= 2 && n > 0)
			return true;
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				flag = false;
				break;
			}
			
		}
		
		return flag;
	}
	
	public static int findHCF(int num1, int num2) {
		while(num1 != num2) {
			if(num1 > num2) {
				num1 -= num2;
			}
			else {
				num2 -= num1;
			}
		}
		
		return num1;
	}
	
	
	/* 
	 * Variable arguments
	 * It contains the same data type value
	 * It must be declared at the end of the parameter list
	 */
	public static void show(int index, int ...args) {
		System.out.println("Showing var args: ");
		for(int value : args) {
			System.out.print( (index++) + ".\s\s");
			System.out.println(value);
		}
	}
	
	public static int max(int ...args) {
		int max = Integer.MIN_VALUE;
		for(int value : args) {
			if(value > max)
				max = value;
		}
		
		return max;
	}
	
	public static int sum(int ...args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		/*
		int prime = 19, num1 = 25, num2 = 15, hcf;
		System.out.printf("Is %d Prime Number: %b %n", prime, MethodBasics.isPrime(prime));
		hcf = MethodBasics.findHCF(num1, num2);
		System.out.printf("HCF of %d and %d is: %d %n", num1, num2, hcf );
		
		show(1, prime, num1, num2, hcf);
		System.out.printf("Maximum Value among all integer variable is: %d %n", max(prime, num1, num2, hcf));
		System.out.printf("Sum of all integer variable is: %d %n", sum(prime, num1, num2, hcf));
		*/
		
		/*
		 * Using command Line Argument
		 */
		int sum = 0;
		for(String str : args) {
			if(str.matches("[0-9\\.]+")) {
				sum += Double.parseDouble(str);
			}
		}
		
		System.out.println(sum);
	}
}
