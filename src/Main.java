import craps.CrapsGame;
import employee.Consultant;
import employee.Employee;
import employee.Salesperson;
import monkey.Monkey;
import reverse.ReverseNumber;

public class Main {
    public static void main(String[] args) {
        // Reverse Number:
        System.out.println("Reverse Number Exercise");

        int number = ReverseNumber.inputFourDigitInteger();
        ReverseNumber.reverseNumber(number);

        System.out.println("-".repeat(30));

        // Monkey:
        System.out.println("Monkey Exercise");

        Monkey monkey = new Monkey();
        monkey.eat("Banana");
        monkey.eat("Apple");
        monkey.eat("Strawberry");

        monkey.eat("Grape");

        monkey.digest();
        monkey.eat("Grape");

        monkey.seeStomach();

        System.out.println("-".repeat(30));

        // Employee:
        System.out.println("Employee Exercise");

        Employee salesperson = new Salesperson("John", 12345678910L, 50, 100);
        Employee consultant = new Consultant("Camila", 12345678910L, 300, 50);

        Double salespersonSalary = salesperson.calculateSalary();
        Double consultantSalary = consultant.calculateSalary();

        System.out.printf("Salesperson salary: R$%.2f\n", salespersonSalary);
        System.out.printf("Consultant salary: R$%.2f\n", consultantSalary);

        System.out.println("-".repeat(30));

        // Challenge: Craps Game
        System.out.println("Craps Game Challenge");

        CrapsGame.playCraps();

        System.out.println("-".repeat(30));

    }
}
