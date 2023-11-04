// Client Code
public class FileSystemClient {
    public static void main(String[] args) {
        // Creating the file system structure
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent directory1 = new Directory("dir1");
        FileSystemComponent directory2 = new Directory("dir2");

        ((Directory) directory1).addComponent(file1);
        ((Directory) directory1).addComponent(file2);

        ((Directory) directory2).addComponent(directory1);
        ((Directory) directory2).addComponent(file2);

        // Displaying the file system structure
        directory2.display();
    }
}