package composit;

public class Folder implements FileOperation {
    private String name;
    private java.util.List<FileOperation> children;

    public Folder(String name) {
        this.name = name;
        this.children = new java.util.ArrayList<>();
    }

    public void add(FileOperation fileOperation) {
        children.add(fileOperation);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileOperation child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public void displayStructure(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileOperation child : children) {
            child.displayStructure(indent + "  ");
        }
    }

    @Override
    public void delete() {
        for (FileOperation child : children) {
            child.delete();
        }
        System.out.println("Deleting folder: " + name);
    }
    
}
