package FileReader;

public class HTMLReader extends FileReaderDecorator{
    public HTMLReader(IFileReader fileReader) {
        super(fileReader);
    }

    @Override
    public String parseContents() {
        return "<"+ this.getContents() + "/>";
    }
}
