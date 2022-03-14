package C9Methods;

import java.util.Scanner;

public class MethodsClass {

    //Exercitiul1
    public static boolean isPrime(int number) {
            if (number <2 ) {
                return false;
            }

            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void printNumber(int number) {
            for (int i = 2; i <= number; i++) {
                if (isPrime(i) == true) {
                    System.out.println("prime number: " + i);
                }
            }
        }


        //Exercitiul2

    public static int numberLen (int n)
    {
      int countDigits = 0;
        while(n != 0)
        {
            countDigits++;
            n /=10;
        }
        return countDigits;

    }


    //Exercitiul3
    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double multiply3(double operand1, double operand2, double operand3) {
        return multiply2(operand1, operand2) * operand3;
    }

    public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        return multiply3(operand1, operand2,operand3) * operand4;
    }

   //Exercitul4
    public static boolean isPalindrom(int n) {

        int digit = 0;
        int newNumber = 0;
        int oldNumber = n;

        while (n != 0) {
            digit = n % 10;
            newNumber = newNumber * 10 + digit;
            n /= 10;
        }

        //      1221
        //
        //      digit = 1221 % 10 = 1
        //              newnumber = 0 *10 + 1; 1
        //       1221 = 1221/10 122
        //
        //       digit = 122 % 10 = 2
        //          newnumber = 1 *10 + 2; 12
        //          122 = 122/ 10 = 12
        //
        //
        //              12 10 = 2
        //          newNumber = 12 * 10 + 2; 122
        //      12 =12/10 = 1
        //              digit = 1
        //                      newnumber = 122 *10 + 1;1221
        //      n=0 ( iese din while)



        if (oldNumber == newNumber) {
            return true;
        }
        return false;
    }




    }









