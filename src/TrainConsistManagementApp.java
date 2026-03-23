import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Consist Management App ===");

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie ID: ");
            String id = sc.nextLine();
            bogieIds.add(id);
        }

        System.out.println("Unique Bogie IDs: " + bogieIds);

        sc.close();
    }
}