package reverse;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(int number) {
        String stringNumber = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(stringNumber);
        String reversedNumber = String.valueOf(stringBuilder.reverse());
        System.out.printf("O inverso do número %d é: %s\n", number, reversedNumber);
    }

    public static int inputFourDigitInteger() {
        int number = 0;
        boolean isValidNumber = false;
        while (!isValidNumber) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número de 4 algarismos: (Entre 1000 e 9999) ");
            number = scanner.nextInt();
            if (number >= 1000 && number <= 9999) isValidNumber = true;
            else System.out.println("Por favor, digite um número válido!");
        }
        return number;
    }
}
