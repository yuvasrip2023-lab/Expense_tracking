import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Integer> expenses = new ArrayList<>();

    // Add expense
    public void addExpense(int amount) {
        expenses.add(amount);
    }

    // Remove expense
    public void removeExpense(int amount) {
        expenses.remove(Integer.valueOf(amount));
    }

    // Calculate total expense
    public int getTotalExpense() {
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        return total;
    }

    // Main method
    public static void main(String[] args) {
        App tracker = new App();
        tracker.addExpense(500);
        tracker.addExpense(300);

        System.out.println("Total Expense: " + tracker.getTotalExpense());
    }
}

