import java.util.Scanner;

public class FtoCConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Fahrenheit = 0;
        double Celsius = 0;
        boolean run = true;
        String letter = "";
        String trash = "";


        run = false;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextInt())
            {
                Celsius = in.nextInt();
                in.nextLine();
                System.out.println("You entered the number" + Celsius);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Trash");
                System.out.println("You must enter a valid number not " +trash );
            }

            Fahrenheit = (Celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
            System.out.println("Would you like to run the program again? ");
            run = in.nextBoolean();

        }
        while (run);
    }
}
