package composit;

import composit.File;
import composit.FileOperation;
import composit.Folder;

public class FileExplorerApp {
 
    public static void main(String[] args) {
        System.out.println("File Explorer Application");
        
        File f = new File("MyFile.txt", 100);


        FileOperation file1 = new File("Document.txt", 120);
        FileOperation file2 = new File("Image.png", 300);
        FileOperation folder1 = new Folder("MyFolder");
        FileOperation file3 = new File("Video.mp4", 1500); 

        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);

        file2.displayStructure("-");
        folder1.displayStructure("-");

    }
}