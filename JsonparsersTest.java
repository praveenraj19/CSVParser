import org.junit.Test;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JsonparsersTest {
    @Test
    public void testInput() throws IOException, SAXException, ParserConfigurationException {
        Jsonparsers parser = new Jsonparsers();
        String fileName = "/data.json";
        String test = parser.parsersjson(fileName);
        assertNotNull(test);
    }

    @Test
    public void testFormat() throws IOException, SAXException, ParserConfigurationException {
        Jsonparsers parser = new Jsonparsers();
        String fileName = "/data.json";
        String test = parser.parsersjson(fileName);
        assertEquals(fileName, test);

    }


}
