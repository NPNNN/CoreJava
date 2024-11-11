package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuDriven_BookandPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Display Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {  // Add Book
                System.out.print("Enter Book Name: ");
                String name = sc.next();
                if (map.containsKey(name)) {
                    System.out.println("Book already exists");
                } else {
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    map.put(name, price);
                    System.out.println("Book added");
                }
            } else if (ch == 2) {  // Update Book
                System.out.print("Enter Book Name: ");
                String name = sc.next();
                if (map.containsKey(name)) {
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    map.replace(name, price);
                    System.out.println("Book updated");
                } else {
                    System.out.println("Error: Invalid Book Name");
                }
            } else if (ch == 3) {  // Display Book
                System.out.print("Enter Book Name: ");
                String name = sc.next();
                if (map.containsKey(name)) {
                    System.out.println("Price: " + map.get(name));
                } else {
                    System.out.println("Error: Invalid Book Name");
                }
            } else if (ch == 4) {  // Remove Book
                System.out.print("Enter Book Name: ");
                String name = sc.next();
                if (map.containsKey(name)) {
                    map.remove(name);
                    System.out.println("Book removed");
                } else {
                    System.out.println("Error: Invalid Book Name");
                }
            } else if (ch == 5) {  // Quit
                System.out.println("End");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
