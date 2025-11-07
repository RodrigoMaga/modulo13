package org.example.application;

import org.example.entities.Employee;
import org.example.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print( "Outsourced(y/n)? ");
            char isOutsourced = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (isOutsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee e : employees) {
            System.out.print(e.getName() + " - $ " + String.format("%.2f", e.payment()) + "\n");
        }

        scanner.close();
    }
}
