package C10Classes;

public class Calculations {

    public boolean perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        return false;
    }

    public int sumaCifrelor(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public boolean isPrime(int n){
        if (n == 1) {
            return true;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    double distanceBetweenPlayers(double positionX1, double positionX2, double positionY1, double positionY2){
        double distance = Math.sqrt(Math.pow((positionX1-positionX2),2) + Math.pow((positionY1-positionY2),2));
        return distance;
    }
}
