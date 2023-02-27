import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        //Declare
        Scanner in = new Scanner(System.in);
        double temp = 0;
        double conversion;
        String trash;

        //Input
        System.out.print("Enter a temperature in Celsius: ");

        if (in.hasNextDouble()) {
            // OK safe to read in a double
            temp = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else{
        while (!in.hasNextDouble()) {
            trash = in.nextLine();
            System.out.print("Please enter a valid temperature: ");
            if (in.hasNextDouble()) {
                // OK safe to read in a double
                temp = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                break;
            }
        }
        }


            //Conversion and Print
            conversion = temp * 9 / 5 + 32;

            System.out.println("Your temp in Fahrenheit is " + conversion);
        }
    }
