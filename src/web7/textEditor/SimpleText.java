package web7.textEditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleText extends Record {

    public SimpleText(String text) {
        super(text);
        this.text = text;
    }

    public SimpleText(Record... param) {
        super(param);
        for (Record r : param){
            text += r.text;
        }
    }

    @Override
    public String getString() {
        StringBuilder str = new StringBuilder();
        for(Record s : records){
            if(s != null)
                str.append(s.text);
        }
        return str.toString();
    }
}
