import junit.framework.TestCase;

public class GeneratorTest extends TestCase {

    //Test Case - Får vi den rigtige værdi
    //Input x = Generator.stenSaksPapir()
    //Forventet output: x = 2
    public void testStenSaksPapir() {
        int x = Generator.stenSaksPapirNumber();

        assertEquals(2, x);

    }

    //Test Case - Får vi den rigtige betegnelse
    //Input: output = Generator.stenSaksPapirString()
    //Forventet output: output = "Saks"
    public void testString() {
        String output = Generator.stenSaksPapirString();

        assertEquals("Saks", output);
    }

}