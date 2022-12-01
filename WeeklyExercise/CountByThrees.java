// CountByThrees.java

public class CountByThrees
{
    public static void main(String[] args)
    {
        final int START = 3;
        final int END = 300;
        final int LINE_NUMBERS = 30;
        for(int i = START; i <= END; i+= START)     // from 3 to 300, and i is in increment by 3
        {
            System.out.print(i + " ");
            if (i % LINE_NUMBERS == 0)              // print next values at new line if the end value is
                                                    // divisible by 30
                System.out.println();
        }
    }
}
