
import java.util.Scanner;

class circumference{
	public static void main(String args[]){
		double r, area,circum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter radius");
		r = sc.nextDouble();
		area = 3.14 * r *r;
		System.out.println("Area of circle = "+area);
		circum = 2 *3.14 *r;
		System.out.println("Circumference of circle = "+circum);
	
	}

}