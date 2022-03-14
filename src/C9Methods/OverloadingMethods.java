package C9Methods;

public class OverloadingMethods {


    //Exercitiul2
    public static class FactorialI {

    public static int factorialI(int valoare) {
        int sum = 0;
        int digit = 0;

        while (!(sum == valoare)) {
            for (int i = 0; i <= valoare; i++) {
                digit = valoare % 10;
                sum = i; ;
                valoare /= 10;
            }

        }
        return sum;
    }

    //Exercitiul3

        public static int multiplyWithSumI(int a, int b) {

        int sum = 0;
        for (int i = 0; i<b; i++){
            sum  = sum + a;

        }
        return sum;
        }

        public static void main(String[] args) {
            System.out.println((multiplyWithSumI(7,3)));


        }
    }

}
