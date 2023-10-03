package FileReader;

public class FileReader implements IFileReader{

    private String contents;
    private String path;

    public FileReader(File file){
        this.path = file.getPath();
        this.contents = file.getContents();
    }

    @Override
    public String getContents() {
        return contents;
    }

    @Override
    public String parseContents() {
        return contents;
    }

}
