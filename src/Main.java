import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Declare
        Scanner in = new Scanner(System.in);
        double temp = 0;
        double conversion;
        String trash;

        //Input
        System.out.print("Enter a temperature in Celsius: ");

        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            temp = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your temp was: "  + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        //Conversion and Print
        conversion = temp * 9/5 + 32;

        System.out.println("Your temp in Fahrenheit is " + conversion);


    }
}