package chain;

public class Data {
    private String header;
    private String content;

    public Data(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public String toString(){
        return "Header: "+header+"\n"+
                "Content: "+content;
    }
}
