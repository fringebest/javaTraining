package C4;

public class ExercitiiC4 {

    public static void main(String[] args) {

        byte byteValue =  125;
        short shortValue = -220;
        int intValue = 1000 + 5 * (byteValue - shortValue);

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);

        //Exercitiul2

        long longValue = 2_000_000_000_001L;
        float floatValue = 0.234_567_809_1F;

        System.out.println(longValue);
        System.out.println(floatValue);


        //Exercitiul3

        byte verySmallNumber = -123;
        short veryShortNumber = 123_23;

        int integerNumber1 = verySmallNumber * 2;

        long veryBigNumber = 123_456_000_000_001L;

        integerNumber1 = integerNumber1 + 20;

        //Exercitiul4

        long totalTimeSpent = 2_100_000_000L; //minutes

// .... 100.000.000 minutes pass ....

        totalTimeSpent = totalTimeSpent + 100_000_000; // increase the value

// Print the total time
// Output should be 2_100_000_000 + 100_000_000 = 2_200_000_000 minutes
        System.out.println(totalTimeSpent);



        //Exercitiul6


        int mile = 1200;

        float numarKm = mile * 1_609F;

        System.out.println(numarKm);

        //Exercitiul7

        char initialaNumelui = 'N';
        char initialaPrenumelui = 'C';

        System.out.println(initialaNumelui);
        System.out.println(initialaPrenumelui);


        char unicodeChar = '\u03A9';
        System.out.println(unicodeChar);

        //Exercitiul9

        boolean ziImpara = false;
        boolean halfPartOfTheYear = true;

        System.out.println(ziImpara);
        System.out.println(halfPartOfTheYear);

    }

}
