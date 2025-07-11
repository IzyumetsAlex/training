import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.CommaSeparatedArray;
import ru.education.Task1;


public class Tests {


    @Test
    public void toUpperCaseTest() {
        Task1 t1 = new Task1();
        Assertions.assertEquals("BIG", t1.toUpperCase("big")); //ghjdthr
    }

    @Test
    public void toLowerCaseTest() {
        Task1 t1 = new Task1();
        Assertions.assertEquals("small", t1.toLowerCase("SMALL"));
    }

    @Test
    public void test2() {
        CommaSeparatedArray o1 = new CommaSeparatedArray(new int[]{1, 2, 5});
        o1.print();
    }
}
