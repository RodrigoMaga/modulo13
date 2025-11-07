package org.example.application;

import org.example.entities.ImportedProduct;
import org.example.entities.Product;
import org.example.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char c = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (c == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.next());
                list.add(new UsedProduct(name, price, date));
            }
            if (c == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            if (c == 'c') {
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("Price tags: ");

        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        scanner.close();
    }
}
