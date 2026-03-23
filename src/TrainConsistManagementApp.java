import java.util.Scanner;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== Train Consist Management App ===");

        System.out.print("Enter number of bogies to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie name: ");
            String bogie = sc.nextLine();
            System.out.print("Add at (1) start, (2) end, (3) specific position? ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                trainConsist.addFirst(bogie);
            } else if (choice == 2) {
                trainConsist.addLast(bogie);
            } else if (choice == 3) {
                System.out.print("Enter position (0 to " + trainConsist.size() + "): ");
                int pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos <= trainConsist.size()) {
                    trainConsist.add(pos, bogie);
                } else {
                    System.out.println("Invalid position. Adding at end.");
                    trainConsist.addLast(bogie);
                }
            } else {
                System.out.println("Invalid choice. Adding at end.");
                trainConsist.addLast(bogie);
            }
        }

        System.out.println("Final Train Consist: " + trainConsist);

        sc.close();
    }
}