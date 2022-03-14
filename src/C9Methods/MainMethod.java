package C9Methods;

import java.util.Scanner;

public class MainMethod extends MethodsClass {

    public static void main(String[] args) {
       //Exercitiul1
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrie de la tastatura un numa prim n:");
        int number = sc.nextInt();
        System.out.println("numarul introdus este prim: " + isPrime(number));
        printNumber(number);

        //Exercitiul2
        int testNumber = 25;
        System.out.println("The number " + testNumber + " has " + numberLen(testNumber) + " digits ");
        int testNumber1 = 1_879_658;
        System.out.println("The number " + testNumber1 + " has " + numberLen(testNumber1) + " digits ");

        //Exercitiul3

        double operand1 = 3;
        double operand2 = 4;
        double operand3 = 5;
        double operand4 = 6;

        System.out.println("rezultatul inmultiri a 2 nr: " + multiply2(operand1,operand2));
        System.out.println("rezultatul inmultiri a 2 nr: " + multiply3(operand1,operand2,operand3));
        System.out.println("rezultatul inmultiri a 2 nr: " + multiply4(operand1,operand2,operand3,operand4));


        //Exercitiul4

        System.out.println("Numarul este palindrom?: " + isPalindrom(1221));


    }








}
