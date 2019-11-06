package web7.textEditor;

import java.util.Arrays;
import java.util.List;

public abstract class Record {

    List<Record> records;
    String text;

    public Record(String text) {
        this.text = text;
    }

    public Record(Record ... param) {
        records = Arrays.asList(param);
    }

    public abstract String getString();
}
