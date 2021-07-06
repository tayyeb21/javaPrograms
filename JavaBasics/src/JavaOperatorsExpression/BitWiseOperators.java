package JavaOperatorsExpression;

public class BitWiseOperators {
	
	public static void swapping(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.printf("After Swapping: %na = %d %nb = %d %n", a, b);
	}
	
	public static byte Merging(byte a, byte b) {
		byte result = 0b0;
		result = (byte)(a << 4);
		result = (byte)(result | b);
		
		return result;
	}
	
	public static void Masking(byte result) {
		byte a, b;
		a = (byte) ((result & 0b11110000) >> 4);
		b = (byte)(result & 0b00001111);
		
		System.out.printf("Value of First Number: %d %nValue of Second Number: %d %n", a,b);
	}
	
	public static void main(String[] args) {
		/* 
		 * Bitwise Operator only works with integer data type and also only returns inteeger values
		 */
		int x = 10; // 1010 0b1010
		int y = 6; //  0110 0b0110
		int and, or, xor, not, rshift, unsignedRShift, lshift;
		
		/*
		 * & operator performms AND operations on integer
		 * | operator performms OR operations on integer
		 * ^ operator performms XOR operations on integer
		 */
		and = x & y; 
		or = x | y;
		xor = x ^ y;
		System.out.printf("AND Operation: %d %nOR Operation: %d %nXOR Operation: %d %n", and, or, xor);
		
		/*
		 * LEFT SHIFT
		 * LEFT SHIFT operator shifts the bits one place to the left that vacant the right most bit position which is filled by 0;
		 * It ignores the value at left most bit and change it to 0 before sign bit
		 * The left shift operator doubles the number means if the number is left shifted by k place it will increase the number by:
		 *                                  number * 2^k
		 */
		// x = -10;
		lshift = x<<1;
		System.out.println("LEFT Shift: " + lshift);
		
		/*
		 * Right SHIFT
		 * RIGHT SHIFT operator shifts the bits one place to the right that vacant the left most bit position before signed bit which is filled by 0;
		 * It ignores the value at right most bit before change it to 0 
		 * The right shift operator divides the number by:
		 *              number / 2^k
		 * Right shift operator keeps the sign bit in its place meaning it do not right shift the sign bit at beginning hence keeps the number negative
		 * Negative number in java is represented in 2's complement form                
		 */
		
		// x = 2_147_483_647;
		rshift = x>>1;
		System.out.println("Right Shift: " + rshift);
		
		/*
		 * Unsigned Right SHIFT
		 * Unsigned Right SHIFT operator shifts the bits one place to the right including the sign bit hence it converts the number in positive but value may change;
		 * Meaning -10 will be changed to 123 because -10 is represented in following manner in java
		 * 11110110 [Have taken 1 byte representation however in java it is of 4 byte]
		 * First 1 of above bits represents sign bit where 1 is minus and 0 is plus
		 * After performing unsigned right shift on above bits it will be converted in following bits
		 * 01111011                 
		 */
		
		x = -10;
		unsignedRShift = x>>>1;
		System.out.println("Unsigned Right Shift: " + unsignedRShift);
		
		/*
		 * NOT Operator
		 * NOT operator performs not operation on integer values which inverse the bits 
		 * NOT operator converts the sign of the number 
		 * NOT operators converts the positive number into negative number by incrementing the number by 1 and vice versa 
		 * for example if the number is +10 then NOT operator will convert the number as -11 and vice versa
		 */
		// x = 10;
		not = ~x;
		System.out.println("Not Operation: " + not);
		
		/*
		 * Bitwise Operator Implementaion and real time use 
		 * Making, Merging and Swapping Operation using bitwise Operator 
		 * 
		 */
		
		/* swapping */
		System.out.printf("Orginal values %na = %d %nb = %d %n", x, y);
		BitWiseOperators.swapping(x, y);
		
		/* Merging */
		byte result = BitWiseOperators.Merging((byte)5, (byte)9);
		System.out.println("After Merging: "+ Integer.toBinaryString(result));
		System.out.println("After Masking: ");
		BitWiseOperators.Masking(result);
		
		
		
	}
}
