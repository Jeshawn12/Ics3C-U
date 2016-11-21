/**
 * 
 */
package gordon;
import java.util.Scanner;
/**Expressions.java
 * @author 324003813
 *Jeshawn Gordon
 *09/28/16
 *Something with numbers
 */
public class AritmeticExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		

		int num1, num2, num3, num4,num5; 
		System.out.println("Enter 5 numbers");
		 num1 = Scan.nextInt();
		 num2 = Scan.nextInt();
		 num3 = Scan.nextInt();
		 num4 = Scan.nextInt();
		 num5 = Scan.nextInt();
		 
		 System.out.println("Your total is: " +(num1+num2+num3+num4+num5) );
		 System.out.println("Your result after subtracting the second number from the third is: " +(num2-num3) );
		 System.out.println("The product of the first and fifth numbers is: " +(num1*num5));
		 System.out.println("The quotient of the fourth number divided by the second is: " +(num4/num2));
		 System.out.println("The remainder when dividing the fourth number by the second is: " +(num4%num2));
		 System.out.println("The first number raised to the power of the third number is:"  +Math.pow(num1, num3));
		 System.out.println("The square root of the fifth number is:" +Math.sqrt(num5));
		 
		 
	}

}
