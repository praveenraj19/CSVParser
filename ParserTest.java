import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class ParserTest {
    @Test
    public void testInput(){
        Parsers parser = new Parsers();
        String fileName = "C:/Users/User/Downloads/data.csv";
        String test = parser.parserscsv(fileName);
        assertNotNull(test);
    }

    @Test
    public void testFormat(){
        String fileName = "C:/Users/User/Downloads/data.csv";
        Parsers parser = new Parsers();
        String str = parser.parserscsv(fileName);
        assertEquals(fileName, str);

    }

    
}