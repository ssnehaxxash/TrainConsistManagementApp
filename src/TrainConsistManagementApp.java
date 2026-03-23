import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("=== Train Consist Management App ===");

        System.out.print("Enter number of bogies to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie name: ");
            String bogie = sc.nextLine();
            System.out.print("Enter capacity for " + bogie + ": ");
            int capacity = sc.nextInt();
            sc.nextLine(); // consume newline
            bogieCapacity.put(bogie, capacity);
        }

        System.out.println("\nBogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " bogie capacity: " + entry.getValue());
        }

        sc.close();
    }
}