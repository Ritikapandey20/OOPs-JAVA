import java.util.Scanner;
 class Practical2{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a value a= ");
       double a = sc.nextDouble();
       
       System.out.print("Enter a value b= ");
       double b = sc.nextDouble();

       System.out.print("Enter a value c= ");
       double c = sc.nextDouble();

       System.out.print("Enter a value d= ");
       double d = sc.nextDouble();

       System.out.print("Enter a value e= ");
       double e = sc.nextDouble();

       System.out.print("Enter a value f= ");
       double f = sc.nextDouble();

               // Cramer's Rule formulas
        double D  = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Checking if denominator is zero
        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }

        sc.close();
    }
}
     

    

  
  
  
 


   