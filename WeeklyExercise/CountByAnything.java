// CountByAnything.java

import java.util.Scanner;
public class CountByAnything
{
    public static void main(String[] args)
    {
        final int END = 300;                                    // set end point
        final int NUMBER_PER_LINE;
        Scanner keyboard = new Scanner(System.in);
        int userCountBy;
        System.out.print("Enter value to count by: ");
        userCountBy = keyboard.nextInt();
        NUMBER_PER_LINE = userCountBy * 10;                     // set the end value to print at new line
        for(int i = userCountBy; i <= END; i+= userCountBy)     // print from i to 300, with increment by i
        {
            System.out.print(i + " ");
            if (i % NUMBER_PER_LINE == 0)                       // print next values at new line if the end value is
                                                                // divisible by i*10 (or after 10 values
                System.out.println();
        }
    }
}

