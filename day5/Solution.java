import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class Point
  {
      private double x;
      private double y ;
      
       double distance(double p1,double p2)
      {
           this.x = p1;
           this.y = p2;
          
          return Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
          
      }
      
      
  }

public class Solution extends Point {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
         Point p1 = new Point();
        
         double result = p1.distance(x,y);
        
         System.out.println(result);

    
         
        
    }
}