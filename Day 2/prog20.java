import java.util.Scanner;

class prog20{
	public static void main(String[] args) 
    { 
	        int a, b, i, j, flag; 

        Scanner sc = new Scanner(System.in); 
		System.out.printf("\n Enter starting interval: "); 
        a = sc.nextInt(); 
   
        System.out.printf("\n Enter ending interval: "); 
        b = sc.nextInt(); 
  
		System.out.printf("\nPrime numbers between given interval are: ", a, b); 
  
        for (i = a; i <= b; i++)
		{ 
			if (i == 1 || i == 0) 
                continue; 
  
            flag = 1; 
  
            for (j = 2; j <= i / 2; ++j)
			{ 
                if (i % j == 0)
				{ 
                    flag = 0; 
                    break; 
                } 
            } 
 
            if (flag == 1) 
                System.out.println(i); 
        } 
    } 
} 
 