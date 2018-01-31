package algos;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 13;
        System.out.println("the number " + number + " is prime ? " + isPrime(number));

        for (int i = 0; i < 100; i++) {
            if (isPrime(i))
                System.out.println(i + " is prime");
            else
                System.out.println(i + " is not prime");
        }
    }

    public static boolean isPrime(int number) {

        int i = 2;

        if (number == 1 || number == 2 || number == 3)
            return true;

        while (i < number) {
            if (number % i == 0)
                return false;
            i++;
        }

        return true;
    }
}
