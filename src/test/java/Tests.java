import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.Task1;


public class Tests {


    @Test
    public void test1() {
        Task1 t1 = new Task1();
        Assertions.assertEquals("BIG", t1.print("big"));
    }
}
