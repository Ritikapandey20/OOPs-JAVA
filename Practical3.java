import java.util.Scanner;
public class Practical3{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a char = ");
      char ch = sc.next().charAt(0);
      ch = Character.toLowerCase(ch);
      if (ch >= 'a' && ch <= 'z') {

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }

        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}