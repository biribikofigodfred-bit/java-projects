import java.util.Scanner;
public class QuadraticEqn {
    

    static void solveRoot1(double a, double b, double c){
        double root1;
        double root2;
         double d =  b*b - 4 * a * c;
        if(a == 0){
           
            System.out.println("not a quadratic equation");
           
        } else if(d  > 0){
           root1 = (-b + Math.sqrt(d)) /(2*a);
           root2 = (-b - Math.sqrt(d)) /(2*a);
           System.out.println("roots: " + root1 + " and "+ root2);
        
        }else if(d == 0){
            root1 = (-b + Math.sqrt(d)) /(2*a);
            System.out.println("root: " + root1);

        }
        else{
            double real =  -b / (2*a);
            double imaginary = Math.sqrt(-d) / (2*Math.abs(a)); 
            System.out.println("Equation has a complex root");
            System.out.println("root 1: " + real + " + " + imaginary + "i" );
            System.out.println("root 2: " + real + " - " + imaginary + "i" );

        }
    }

    public static void main(String[] arg){
  
      Scanner input = new Scanner(System.in);  
      
    //  user input
    System.out.println("Enter the coefficient a, b, c of the quadratic equation");
     double a = input.nextDouble();
    double b = input.nextDouble();
     double c = input.nextDouble();
    
     System.out.println("Equation: " + a + " x^2" + (b < 0 ? " - " : " + ") + Math.abs(b) + " x " + (c<0?"- " :"+ ") + Math.abs(c) + " = 0" );
    
     solveRoot1( a,  b ,  c);
     
     input.close();        
    }
}
