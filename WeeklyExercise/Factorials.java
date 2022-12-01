// Factorials.java

public class Factorials
{
    public static void main(String[] args)
    {
        final int MAX = 10;
        int factorial;
        for (int i = 1; i <= MAX; i++)          // start with 1 and end with 10
        {
            factorial = i;
            for (int f = i - 1; f > 0; --f)     // f is one less than i, hence, factorial will be executed in a
                                                // loop until f is more than 0, and the value of the starting i
                                                // will be multiplied with all values of f
                factorial = factorial * f;
            System.out.println("The factorial of " + i + " is: " + factorial);
        }
    }
}
