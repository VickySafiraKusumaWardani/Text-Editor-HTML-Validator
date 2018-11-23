/** 
Authors:
Shivank Pahwa
Sheena Gupta
Shubhra Pandey
Rishika Chowdhary
Shreya Nigam
**/
package simplejavatexteditor;

import java.util.ArrayList;

public class SupportedKeywords {

    private String[] supportedLangage = {".html",".css"};

    private String[] css = {"fonts", "head", "h1", "", "<li>", "<a>",
                "b", "a", "strong", "div", "img", "em", "section", "table",
                "tr", "td", "ahref", "body", "Loremipsumdolorsitamet,consecteturadipiscingelit,seddoeiusmodtemporincididuntutlaboreetdoloremagnaaliqua."};

    private String[] html = { "<html>", "<head>", "<!DOCTYPE", "<ul>", "<li>", "<a>",
                "<b>", "<a>", "<strong>", "<div>", "<img>", "<em>", "<section>", "<table>",
                "<tr>", "<td>", "<a href>", "<body>", "Loremipsumdolorsitamet,consecteturadipiscingelit,seddoeiusmodtemporincididuntutlaboreetdoloremagnaaliqua" };

    public String[] getSupportedLangage() {
        return supportedLangage;
    }

    private String[] brackets = { "{", "(","<" };
    private String[] bCompletions = { "}", ")",">" };
    public String[] getcssKeywords() {
        return css;
    }
    public String[] gethtmlKeywords() {
        return html;
    }
    public ArrayList<String> getbracketCompletions() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : bCompletions) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> getbrackets() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : brackets) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> setKeywords(String[] arr) {
        ArrayList<String> al = new ArrayList<>();
        for(String words : arr) {
            al.add(words);
        }
        return al;
    }

}
5
