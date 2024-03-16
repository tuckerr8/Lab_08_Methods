import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        //Setting parameters
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        //Program asks user their first and last names
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name: ");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name: ");

        //Display names
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
