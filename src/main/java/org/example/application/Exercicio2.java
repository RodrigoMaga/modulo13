package org.example.application;

import org.example.entities.Legal;
import org.example.entities.Natural;
import org.example.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Natural or legal (n/l): ");
            char c = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = scanner.nextDouble();
            if (c == 'n') {
                System.out.print("Health expenses: ");
                double healthExpenses = scanner.nextDouble();
                list.add(new Natural(name, annualIncome, healthExpenses));
            }else {
                System.out.print("Number of employees: ");
                int employeeAmount = scanner.nextInt();
                list.add(new Legal(name, annualIncome, employeeAmount));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double total = 0.0;

        for (Person p : list) {
            System.out.println(p);
            total += p.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));

        scanner.close();
    }
}
