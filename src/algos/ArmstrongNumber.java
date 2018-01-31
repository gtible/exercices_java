package algos;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 99;
        System.out.println("the number = " + number + " is Armstrong number ? " + isArmstrongNumber(number));
        System.out.println("Le nom du thread principal est " + Thread.currentThread().getName());


    }

    public static boolean isArmstrongNumber(int number) {


        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(number);
        String strI = sb.toString();

        int result = 0;

        for (int i = 0; i < strI.length(); i++) {
            result += Math.pow(Integer.parseInt(String.valueOf(strI.charAt(i))), 3);
        }

        if (number == result)
            return true;
        else
            return false;
    }
}
