import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.ArraysUtils;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArraysUtils {

    @Test
    public void testFindMin() {
        int[] array = {5, 3, 8, 1, 0, 0 , -5, 6, 4};
        ArraysUtils finder = new ArraysUtils(array);

        int result = finder.findMin();

        assertEquals(-5, result, "Минимальное значение найдено неверно");
    }

}
