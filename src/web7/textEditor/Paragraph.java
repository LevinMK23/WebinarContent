package web7.textEditor;

public class Paragraph extends SimpleText{

    public Paragraph(Record... param) {
        super(param);
    }

    public Paragraph(Record simpleText) {
        super();
    }

    @Override
    public String getString() {
        StringBuilder str = new StringBuilder();
        for(Record s : records){
            str.append(s.text);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Paragraph pr =
                new Paragraph(new SimpleText("123124"), new BoldText("123"),
                        new ItalicText("213214"),
                        new BoldText(new BoldText("134"), new ItalicText("124124")));
        System.out.println(pr.getString());
        System.out.println(pr.records);
       for(Record r : pr.records){
           System.out.println(r.text);
       }
    }
}
