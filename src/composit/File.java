package composit;

public class File implements FileOperation {
    private String name;
    private int size; // size in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "- " + name + " (" + size + "KB)");
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }

    @Override
    public void add(FileOperation file1) {

    }

}
