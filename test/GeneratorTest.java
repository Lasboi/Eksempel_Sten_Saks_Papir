import junit.framework.TestCase;

public class GeneratorTest extends TestCase {

    //Test Case - Får vi den rigtige værdi
    //Input x = Generator.stenSaksPapir()
    //Forventet output: x = 2
    public void testStenSaksPapir() {
        int x = Generator.stenSaksPapir();

        assertEquals(2, x);

    }

}