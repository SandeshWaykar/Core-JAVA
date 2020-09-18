class primitive {
	public static void main(String args[]) {
		int x = 3;
		int y;
		
		//expression A
		y = (x*x)+(3*x)-7;
		System.out.println("Value of y = "+y);
		
		//expression B
		y = x++ + ++x ;
		System.out.println("Value of y = "+y);
		
		//expression C 
			int z;
			z = x++ - --y - --x  +  x++ ;
		System.out.println("Value of z = " +z);
		
		//expression D
		boolean xx = true;
		boolean yy = true;
		
		boolean zz = (xx && yy) || (!(xx || yy)); 
		System.out.println("Value of z = " +zz);
		
	
	}
}