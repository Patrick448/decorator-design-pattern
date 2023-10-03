package FileReader;

public abstract class FileReaderDecorator implements IFileReader{

    private IFileReader fileReader;

    public FileReaderDecorator(IFileReader fileReader){
        this.fileReader = fileReader;
    }

    @Override
    public String getContents() {
        return fileReader.getContents();
    }

    public abstract String parseContents();

}
