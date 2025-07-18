import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.ValueFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestValueFinder {


        @Test
        public void testFindMin() {

            int[] array = {5, 3, 8, 1, 0, 0 , -5, 6, 4};
            ValueFinder finder = new ValueFinder(array);

            int result = finder.findMin();

            assertEquals(-5, result, "Минимальное значение найдено неверно");
            //System.out.println(result);
        }
}
/*
        @Test
        public int test3 () {
            TestValueFinder o1 = new TestValueFinder(new int[]{1, 2, 5, 6, 7});
            o1.print();
        }
}
*/