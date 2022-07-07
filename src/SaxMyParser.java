import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser {
    public Sonnet parse(){

        SAXParserFactory factory = SAXParserFactory.newNSInstance();
        SaxParserHandler handler = new SaxParserHandler();
        return null;
    }
}
