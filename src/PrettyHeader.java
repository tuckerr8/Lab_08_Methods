import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        //Set parameter
        String msg = "";

        //Initialize scanner
        Scanner in = new Scanner(System.in);

        //get message for header
        msg = SafeInput.getNonZeroLenString(in,"Enter a message");
        prettyHeader(msg);

    }

    //Display the message in the header
    public static String prettyHeader(String msg)
    {
        for (int x=1; x<=60; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        int length = msg.length();

        int space = (54 - length)/2;

        for (int x = 1; x<=space; x++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int x = 1; x<=space; x++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        for (int x=1; x<=60; x++)
        {
            System.out.print("*");
        }
        return msg;
    }
}
