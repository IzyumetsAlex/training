import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.education.Task1;


public class Tests {


    @Test
    public void toUpperCaseTest() {
        Task1 t1 = new Task1();
        Assertions.assertEquals("BIG", t1.toUpperCase("big"));
    }

    @Test
    public void toLowerCaseTest() {
        Task1 t1 = new Task1();
        Assertions.assertEquals("small", t1.toLowerCase("SMALL"));
    }
}
