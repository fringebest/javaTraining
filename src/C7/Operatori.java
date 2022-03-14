package C7;

import java.util.Scanner;

public class Operatori {

    public static void main(String[] args) {

        double leftToRightOrderComputation = (100d + (5d * 10d)) - ((2.23d * 18d) / 4d) +2d;

        System.out.println(leftToRightOrderComputation);


//Exertitiul3
        int mathEquation, operand1, operand2, operand3;

// Este valid? - NU
// De ce? Raspunsul tau: Nu ii poate asocia o valoare lui operand3
       // operand1 = operand2 = operand3;

// Este valid? -  NU
// De ce? Raspunsul tau: mathEquation nu este initializat
        //System.out.println(mathEquation);

// Este valid? - DA
// De ce? Raspunsul tau: mathEquation are o valoare atribuita
       // System.out.println(mathEquation = 4);

// Este valid? - DA
// De ce? Raspunsul tau: Este o suma de doi operanzi valida.
        //mathEquation = operand1 + operand2;

// Este valid? - DA
// De ce? Raspunsul tau: sunt initilizati
        //operand1 = 2; operand2 = 5; operand3 = 14;

// Este valid? - NU
// De ce? Raspunsul tau: Calculul se face de la dreapta la stanga deoarece primul operator este  =
        //mathEquation = operand1 + operand2 = operand3;

// Este valid? -  NU
// De ce? Raspunsul tau: are nevoie de un atribut pentru a stoca rezultatul
        //operand2 + operand3 + operand1;

// Este valid? - NU
// De ce? Raspunsul tau: ...
        //mathEquation = ((((operand1))) + (operand2) + (operand3));

// Este valid? - NU
// De ce? Raspunsul tau: ...
        //mathEquation / 2 = operand1 + operand2;

// Este valid? - DA
// De ce? Raspunsul tau: ...
       // mathEquation = ((operand1)) + (operand2) + (operand3);

// Este valid? -  NU
// De ce? Raspunsul tau: ...
        ///System.out.println(((mathEquation = (operand1 + operand2)/2)));

// Este valid? - NU
// De ce? Raspunsul tau: ...
        //System.out.println(mathEquation = ((mathEquation)));


        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu Lungimea (L) paralelipipedului: ");
        double lungime = sc.nextDouble();

        System.out.println("Introdu latimea (l) paralelipipedului: ");
        double latime = sc.nextDouble();

        System.out.println("Introdu inaltimea (h) paralelipipedului");
        double inaltime = sc.nextDouble();

        double volum = lungime * latime * inaltime;
        double ariaBazei = lungime * latime;
        double ariaLaterala = 2 * (lungime * inaltime +latime * inaltime);
        double ariaTotala = ariaLaterala + 2 * ariaBazei;

        System.out.println("Volumul paralelipedului este: " + volum );
        System.out.println("Aria bazei este: " + ariaBazei );
        System.out.println("Aria laterala este: " + ariaLaterala);
        System.out.println("Aria Totala este: " + ariaTotala);


        System.out.println("Numarul bilei te tip V este : ");
        double bilaV = sc.nextDouble();

        System.out.println("Numarul bilei te tip R este : ");
        double bilaR = sc.nextDouble();
        System.out.println("Numarul bilei te tip N este : ");
        double bilaN = sc.nextDouble();

        double probabilitatea = (bilaV/(bilaV+bilaR+bilaN))*100;

        System.out.println("Probabilitate este: "+ probabilitatea);

    //Exercitiul7

        double op1 = 25.101, op2 = 18.91;
        System.out.println("The sum is: " + (op1 + op2));

    }
}
