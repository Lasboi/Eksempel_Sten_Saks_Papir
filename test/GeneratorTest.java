import junit.framework.TestCase;

public class GeneratorTest extends TestCase {

    public void testStenSaksPapir() {
        int x = Generator.stenSaksPapir();

        assertEquals(2, x);

    }

}