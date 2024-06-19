import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSumGreaterThan100() {
        String[] args = {"70", "50"};
        Main.main(args);
        // Verify the output manually
    }

    @Test
    public void testSumEquals100() {
        String[] args = {"50", "50"};
        Main.main(args);
        // Verify the output manually
    }

    @Test
    public void testSumLessThan100() {
        String[] args = {"30", "40"};
        Main.main(args);
        // Verify the output manually
    }

    @Test
    public void testErrorNegativeNumbers() {
        String[] args = {"-10", "20"};
        Main.main(args);
        // Verify the output manually
    }

    @Test
    public void testErrorZeroNumbers() {
        String[] args = {"0", "20"};
        Main.main(args);
        // Verify the output manually
    }

    @Test
    public void testNoArguments() {
        String[] args = {};
        Main.main(args);
        // Verify the output manually
    }
}
