import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Jsonparsers {

    public static void main(String[] args) throws IOException {
        String file = "/data.json";
        try {
            String k= Jsonparsers.parsersjson(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
    public static String parsersjson(String filename) throws ParserConfigurationException,
            SAXException, IOException {
        InputStream in = Jsonparsers.class.getResourceAsStream(filename);
        if(in==null) {
            System.out.println("Did not find the file 'data.json' in the class path");
            return filename;
        }

        Reader reader = new InputStreamReader(in, "UTF-8");

            Gson gson = new GsonBuilder().create();
            Person p = gson.fromJson(reader, Person.class);
            System.out.println(p);
        return filename;
    }

    public class Person {
        private String firstName;
        private String lastName;
        @Override
        public String toString() {
            return firstName + " - " + lastName;
        }
    }
}

