import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.education.TwoDimensionalArray;

public class TestTwoDimensionalArray {
    @Test
    void testJoinStrings_3x3() {
        String[][] input = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };
        assertEquals("abcdefghi", TwoDimensionalArray.joinStrings(input));
    }
}
