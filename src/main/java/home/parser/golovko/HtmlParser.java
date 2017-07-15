package home.parser.golovko;


import home.parser.ParserAction;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser implements ParserAction {

    private String source;

    public List<String> parseCssQuery(String query) {
        return new ArrayList<String>();
    }

    public void setSource(String source) {
        this.source = source;
    }
}
