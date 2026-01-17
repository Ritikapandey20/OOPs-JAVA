import java.util.Scanner;

class Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        // Loop runs exactly 5 times (five digits)
        for (int i = 0; i < 5; i++) {
            int digit = num % 10;   // get last digit
            num = num / 10;        // remove last digit

            int sum = digit + 1 + carry;

            if (sum == 10) {
                result = result + (0 * place);
                carry = 1;
            } else {
                result = result + (sum * place);
                carry = 0;
            }

            place = place * 10;
        }

        System.out.println("New number: " + result);
        sc.close();
    }
}


        
        
        
        