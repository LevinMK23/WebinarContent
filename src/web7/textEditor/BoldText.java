package web7.textEditor;

public class BoldText extends Record {

    public BoldText(Record... param) {
        super(param);
        text = "*" + text;
        for (Record r : param){
            text += r.text;
        }
        text += "*";
    }

    public BoldText(String s) {
        super(s);
        text = "*" + text + "*";
    }

    @Override
    public String getString() {
        StringBuilder str = new StringBuilder();
        str.append('*');
        for(Record s : records){
            str.append(s.text);
        }
        str.append('*');
        return str.toString();
    }
}
