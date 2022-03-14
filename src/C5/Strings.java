package C5;

public class Strings {
    public static void main(String[] args) {


        // Define and initialize first variable (1 instruction)
        String firstString = "This is my first string.";

        // Define and initialize second variable (2 instructions)
        String mySecondString;
        mySecondString = "This is my second string.";

        // Display the variables values
        System.out.println(firstString);
        System.out.println(mySecondString);

        // Change the value of firstString variable
        firstString = "This is my shiny, new string!";

        // Display the new variable value
        System.out.println(firstString);

        //Exercitiul1

        String prenume = "Marius";
        String nume = "Petrescu";
        int varsta = 35;
        double inaltime = 1.89;
        int copii = 3;


        System.out.println(prenume + " " + nume + " are " + varsta +" ani, " + inaltime +" metri inaltime si " + copii+ " copii");

        //Exercitiul2
        byte aSmallValue = 23;
        int anIntegerBigValue = 15_000;
        double aFloatValue = 237.01;

        double sumTotal = aSmallValue + anIntegerBigValue + aFloatValue;

        System.out.println(sumTotal);

        //Exercitiul3

        double precisionError = 0.001;
        int theApproximateResult = 123003;

        String experimentName = "The maximum speed achieved by the object.";

        System.out.println("Experiment: " + experimentName);
        System.out.println("Final speed result: " + theApproximateResult + precisionError);

    }

}
