package web7.textEditor;

public class ItalicText extends Record {

    public ItalicText(Record... param) {
        super(param);
        text = "/" + text;
        for (Record r : param){
            text += r.text;
        }
        text += "/";
    }

    public ItalicText(String s) {
        super(s);
        text = "/" + text + "/";
    }

    @Override
    public String getString() {
        StringBuilder str = new StringBuilder();
        str.append('/');
        for(Record s : records){
            str.append(s.text);
        }
        str.append('/');
        return str.toString();
    }
}
