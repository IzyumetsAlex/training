import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.ValueFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestValueFinder {

    public TestValueFinder(int[] ints) {

    }

    @Test
    void testFindMin() {
        // Arrange
        int[] array = {5, 3, 8, 1};
        ValueFinder finder = new ValueFinder(array);

        // Act
        int result = finder.findMin();

        // Assert
        assertEquals(1, result, "Минимальное значение найдено неверно");
    }

    //private void minValue() {
    //    TestValueFinder o1 = new TestValueFinder(new int[]{1, 2, 5, 6, 7});
    //    o1.minValue();
    //}
}
/*
    @Test
    public void test3(){
        TestValueFinder o1 = new TestValueFinder(new int[]{1, 2, 5, 6, 7});
        o1.findMin();
    }

}
*/