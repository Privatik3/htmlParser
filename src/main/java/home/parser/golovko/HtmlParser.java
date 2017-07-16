package home.parser.golovko;


import home.parser.ParserAction;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser implements ParserAction {

    private String source;

    public List<String> parseCssQuery(String query) {
        ArrayList<String> result = new ArrayList<String>();

        int i = source.indexOf("</button>");
        String s = source.substring(0,i);

        int ii = s.indexOf("<button");
        String s1 = s.substring(ii +8, i);
        result.add(s1);


        int dlinaSource = source.length();
        int dlina1 = source.indexOf("</button>")+9;
        String rez = source.substring(dlina1,dlinaSource);

        int kon = rez.indexOf("</button>");
        //String s2 = rez.substring(dlina1, dlinaSource);
        int ii2 = rez.indexOf("<button");
        String ss2 = rez.substring(ii2 +8, kon);
        result.add(ss2);



        return result;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
