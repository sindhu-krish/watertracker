import java.util.Scanner;
public class WaterTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int dailyGoal = 2000; 
        int totalDrank = 0;
        
        System.out.println("--- Daily Water Tracker ---");
        
        while (totalDrank < dailyGoal) {
            double percentage = ((double) totalDrank / dailyGoal) * 100;
            
            System.out.printf("\nProgress: %.1f%% (%d/%dml)\n", percentage, totalDrank, dailyGoal);
            System.out.print("Enter amount drank (ml) or '0' to stop: ");
            
            if (!input.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                input.next(); 
                continue;
            }

            int intake = input.nextInt();
            
            if (intake == 0) break;
            if (intake < 0) {
                System.out.println("Amount cannot be negative!");
                continue;
            }
            
            totalDrank += intake;
        }
        
        if (totalDrank >= dailyGoal) {
            System.out.println("\nGoal Reached! You drank " + totalDrank + "ml today. Stay healthy!");
        } else {
            System.out.println("\nSession ended. Total intake: " + totalDrank + "ml.");
        }
        
        input.close();
    }
}