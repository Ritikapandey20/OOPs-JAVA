import java.util.Scanner;
class Practical7 {
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter side a: ");
     double a = sc.nextDouble();

     System.out.println("Enter side b: ");
     double b = sc.nextDouble();

     System.out.println("Enter side c: ");
     double c = sc.nextDouble();

    if(a+b>c && a+c>b && b+c>a){
       double s=a+b+c/2;
       double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

      System.out.println("Area of triangle= "+area);
   }else{
      System.out.println("the given side don't form a valid triangle");
   }
   sc.close();
}
} 