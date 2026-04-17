/*Given an interface Classify with a method String getDivision(double average). Implement this getDivision method in a class Result such that it returns “First Division” if the average is 60 or more.*/

import java.util.Scanner;
interface Classify {
    String getDivision(double average);
}

class Result implements Classify {

     public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "No Division Possible";
    }
}
class Main2{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter avg marks:");
   double avg = sc.nextDouble();
   Result r = new Result();
   String division = r.getDivision(avg);
   System.out.println("Division=" +division);
 }
}
   


