package composit;

public interface FileOperation {

    int getSize();
    void displayStructure(String indent);
    void delete();

    public void add(FileOperation file1);

}
