import home.parser.ParserAction;
import home.parser.golovko.HtmlParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        URL resource = Main.class.getClassLoader().getResource("example.html");
        String source = readFileAsString(resource.getPath());

        ParserAction parser = new HtmlParser();
        parser.setSource(source);

        String query = "button";
        List<String> response = parser.parseCssQuery(query);

        System.out.println("Request: " + query);
        System.out.println("Response: " + Arrays.toString(response.toArray()));
    }

    private static String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}
