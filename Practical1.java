import java.util.Scanner;
public class Practical1{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        System.out.println("\n240390107041");
        System.out.println("enter the meters to convert = ");
        double meter=sc.nextDouble();
        double feet=meter*3.28084;
        System.out.println("Converted Feet= "+ feet);
        sc.close();
}

}