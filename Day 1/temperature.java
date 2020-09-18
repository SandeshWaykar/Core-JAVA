import java.util.Scanner;

class temperature{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
     
			System.out.println("Enter temp in farenheit ");
			double f = sc.nextDouble();
			double c = 5*(f-32)/9;
			System.out.println("Celcius temp = "+c);
		}
}
