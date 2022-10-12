import java.util.Scanner;

public class JavaMathClass {

	public static void main(String[] args) {
	
		double x = 3.14;
		double y = 10;
		double z = Math.round(x);
		
		
		/* Math.max for comparing the big no. and min vice versa
		 * abs for only one variable means absolute value
		 * round (dont know)
		 * ceil like ceiling means upper value for only one variable
		 * floor like floor in our houses means lower round value for one variable
		 * 
		 */
		
		System.out.println(z);
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("The Hypotenuse is: "+c);
		
		scanner.close();
		
		

	}

}
