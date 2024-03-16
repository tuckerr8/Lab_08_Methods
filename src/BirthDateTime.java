import java.util.Random;
import java.util.Scanner;

public class BirthDateTime {

    static String menu = "J-Jan F-Feb M-March A-April";

    public static void main(String[] args) {
        //Set parameters
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        //Ask user for birth year, month, day, hours, and minutes
        birthYear = SafeInput.getRangedInt(in, "What is your birth year", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(in, "What is your birth month", 1, 12);
        birthDay = SafeInput.getRangedInt(in, "What is your birth day", 1, 31);
        birthHour = SafeInput.getRangedInt(in, "What is your birth hour", 1, 12);
        birthMinute = SafeInput.getRangedInt(in, "What is your birth minute", 1, 59);

        int numberOfDays = 0;
        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = 29;
        }


        //Display
        System.out.println("Your birth year is " + birthYear + " Your birth month is " + birthMonth + " Your birth day is " + birthDay + " Your birth hour is "+ birthHour + " Your birth minute is " + birthMinute);

    }
}
