import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddExpense() {
        App tracker = new App();
        tracker.addExpense(500);
        tracker.addExpense(300);

        assertEquals(800, tracker.getTotalExpense());
    }

    @Test
    public void testRemoveExpense() {
        App tracker = new App();
        tracker.addExpense(500);
        tracker.addExpense(300);
        tracker.removeExpense(300);

        assertEquals(500, tracker.getTotalExpense());
    }
}
