package FileReader;

public class JSONReader extends FileReaderDecorator{


    public JSONReader(IFileReader fileReader) {
        super(fileReader);
    }

    @Override
    public String parseContents() {
        return "{"+ getContents() + "}";
    }
}
