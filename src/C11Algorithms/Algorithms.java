package C11Algorithms;

import java.util.Scanner;

public class Algorithms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = sc.nextInt();
    }


    //numar perfect
    static boolean isPerfect(int n)
    {
        // To store sum of divisors
        int sum = 1;

        // Find all divisors and add them
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return true;

        return false;
    }

    //Exercitiul2 Magic Number
    public static boolean isMagic(int n)
    {
        int sum = 0;

        // Note that the loop continues
        // if n is 0 and sum is non-zero.
        // It stops when n becomes 0 and
        // sum becomes single digit.
        while (n > 0 || sum > 9)
        {
            if (n == 0)
            {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }

        // Return true if sum becomes 1.
        return (sum == 1);
    }

}

