package org.example.application;

import org.example.entities.Circle;
import org.example.entities.Rectangle;
import org.example.entities.Shape;
import org.example.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramShapes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or circle (r/c)? ");
            char c = scanner.next().charAt(0);
            System.out.print("Color (BLACK/RED/BLUE): ");
            Color color = Color.valueOf(scanner.next());
            if (c == 'r') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");

        for (Shape s : list ) {
            System.out.println(s.area());
        }
    }
}
