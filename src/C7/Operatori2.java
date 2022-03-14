package C7;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Operatori2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       //Exercitiul1

        int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
        int result;

        result = operand1 + operand2;
        result /=  operand4;
        result += operand3;
        result *= (operand1 * 2);
        result = operand3 - result;
        result = (-3) * 3 *operand4 + result;

        System.out.println(result);


        int var1 = 10;
        int var2 = 15;

       int varResult  = var1++;
       int varResult2 = var1;
       int varResult3 = ++var1;
       int varResult4 = var1--;
       int varResult5 = var1;
       int varResult6 = --var2;
       System.out.println("Rezultatul este: " + varResult);
        System.out.println("Rezultatul este: " + varResult2);
        System.out.println("Rezultatul este: " + varResult3);
        System.out.println("Rezultatul este: " + varResult4);
        System.out.println("Rezultatul este: " + varResult5);
        System.out.println("Rezultatul este: " + varResult6);

        int temperature = 23;

        temperature = temperature ++ - ++temperature +
                        +(-(--temperature)) - (--temperature + temperature++);

        //temperature = 23 - 25 ++(-(24)-(23 + 23);
        //temperature = 23 -25 ++(-24-46);
        //23-25-70
        //-72

        System.out.println(temperature);

        int thisIsVeryUgly = +(+(-(-(-1))));
        System.out.println(thisIsVeryUgly);

        //Exercitiul4

        int pleaseNegateMe = 100;

        pleaseNegateMe = pleaseNegateMe--;
        pleaseNegateMe *= 1;
        pleaseNegateMe /= 1;

        System.out.println("pleaseNegateMe is :" + pleaseNegateMe);



        System.out.println("Tasteaza o valoare pentru litera a: ");
        int a  = sc.nextInt();


        System.out.println("Tasteaza o valoare pentru litera b: ");
        int b = sc.nextInt();

        System.out.println("Tasteaza o valoare pentru litera c: ");

        int c = sc.nextInt();


        //Exercitiul5
        //1
        boolean isABiggestNumber = (a > b) && (a > c);
        System.out.println(isABiggestNumber);

        //2
        boolean isBSmallestNumber = (b < a) && (b < c);
        System.out.println(isBSmallestNumber);

        //3
        boolean isSumOfAAndBSmallThanC = (a+b) < c ;
        System.out.println(isSumOfAAndBSmallThanC);

        //4
        boolean isCBiggestThanArithmeticOfAAndB = c > (a/b);
        System.out.println(isCBiggestThanArithmeticOfAAndB);

        //5
        boolean sumOfAllNumbers = (a+b+c) > 100;
        System.out.println(sumOfAllNumbers);

        //6
        int sumAAndB = (a + c) ;

        boolean isDividedWithTwo = (sumAAndB % 2) == 0 ? true : false ;


        //7

        boolean aMultipleOfB = (a % b) == 0 ? true : false;
        System.out.println(aMultipleOfB);

        //8
        boolean isBBiggerThan = b >(a/c);


        //9
        //boolean isB = b /(a-c);

        //10

        boolean areEqualNumbers =  (a==b) && (a==c) && (b==c);
        System.out.println(areEqualNumbers);
        //11
        boolean areEqualAtLeastTwoNumbers = (a==c) || (a==b) || (b==c);
        System.out.println(areEqualAtLeastTwoNumbers);



        //Exercitiul6
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2001,10,4);

       long days = ChronoUnit.DAYS.between(currentDate,birthDay);

       long age = days / 365;
        System.out.println("Varsta in momentul acesta este de: " + -age + " ani");


        //Exercitiul7

        String time1 = "00:00:00";
        String time2 = "11:51:00";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
       // Date date1 = format.parse(time1);
       // Date date2 = format.parse(time2);
       // long difference = date2.getTime() - date1.getTime();

       // System.out.println("Numarul de secunde de la miezul noptii pana la ora 11:51:00 este de " + difference*3600 + " secunde");















    }
}
