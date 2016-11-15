/**
 * 
 */
package gordon;

/**
 * @author 324003813
 *
 */
public class RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1;
		double x2;
		double x3;
		double x4;
		double x5;
		double x6;
		double x7;
		double x8;
		double x9;
		double x10;
		final double seed=12;
		final double a=1327;
		final double c=700;
		final double m=15;
		
		x1=(a*seed+c)%m;
		x2=(a*x1+c)%m;
		x3=(a*x2+c)%m;
		x4=(a*x3+c)%m;
		x5=(a*x4+c)%m;
		x6=(a*x5+c)%m;
		x7=(a*x6+c)%m;
		x8=(a*x7+c)%m;
		x9=(a*x8+c)%m;
		x10=(a*x9+c)%m;
		
		
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);
		System.out.println(x10);
		
		
	}

}
