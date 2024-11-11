package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuDrivenAccount {
    private int number;
    private String name;
    private double balance;
    private String location;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getLocation() {
        return this.location;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, MenuDrivenAccount> map = new HashMap<>();

        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. Update Location");
            System.out.println("3. Display Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Account Number: ");
                Integer number = sc.nextInt();
                if (map.containsKey(number)) {
                    System.out.println("Account already exists");
                } else {
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();
                    System.out.print("Enter Location: ");
                    String location = sc.next();
                    MenuDrivenAccount acc = new MenuDrivenAccount();
                    acc.setNumber(number);
                    acc.setName(name);
                    acc.setBalance(balance);
                    acc.setLocation(location);
                    map.put(number, acc);
                    System.out.println("Account added");
                }
            } else if (ch == 2) {
                System.out.print("Enter Account Number: ");
                int number = sc.nextInt();
                if (map.containsKey(number)) {
                    System.out.print("Enter new Location: ");
                    String location = sc.next();
                    MenuDrivenAccount acc = map.get(number);
                    acc.setLocation(location);
                    System.out.println("Location updated");
                } else {
                    System.out.println("Error: Invalid Account Number");
                }
            } else if (ch == 3) {
                System.out.print("Enter Account Number: ");
                int number = sc.nextInt();
                if (map.containsKey(number)) {
                    MenuDrivenAccount acc = map.get(number);
                    System.out.println("Details: Name=" + acc.getName() + ", Balance=" + acc.getBalance() + ", Location=" + acc.getLocation());
                } else {
                    System.out.println("Error: Invalid Account Number");
                }
            } else if (ch == 4) {
                System.out.print("Enter Account Number: ");
                int number = sc.nextInt();
                if (map.containsKey(number)) {
                    map.remove(number);
                    System.out.println("Account removed");
                } else {
                    System.out.println("Error: Invalid Account Number");
                }
            } else if (ch == 5) {
                System.out.println("End");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
