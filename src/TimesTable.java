// import Scanner function
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        // create Scanner object
        Scanner reader = new Scanner (System.in);
        // print out, "What times table would you like to make ?"
        System.out.println("What times table would you like to make ?");
        // read the user input, save inside variable "timesTable", read using .nextInt()
        int timesTable = reader.nextInt(); // example = 34
        // use for loop, counter from 1 to 12, incrementing
        for (int i=1; i <=12; i++) {
            System.out.println(i + "x" + timesTable + "=" + i * timesTable);
        }
        // inside the loop, print the times table and calculate timesTable * counter

    }
}
