import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        //Setting parameters
        int favInteger =  0;
        int favDouble = 0;

        //initialize scanner
        Scanner in = new Scanner(System.in);

        //asks user for integer and decimal/double
        favInteger = SafeInput.getInt(in, "What is your favorite integer?");
        favDouble = SafeInput.getDouble(in, "What is your favorite decimal/double?");

        //Display
        System.out.println("Your favorite integer is " + favInteger + " and your favorite double is " + favDouble);

    }
}
