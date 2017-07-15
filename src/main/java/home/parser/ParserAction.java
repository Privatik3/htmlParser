package home.parser;

import java.util.List;

public interface ParserAction {

    public List<String> parseCssQuery(String query);

    public void setSource(String source);
}
