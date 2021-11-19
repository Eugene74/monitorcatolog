package utils;

public class MyEvents implements IFileEvents{
    public void onFileChanged(String path) {
        System.out.println("File changed: " + path);
    }

    public void onFileAdded(String path) {
        System.out.println("File added: " + path);
    }

    public void onFileDeleted(String path) {
        System.out.println("File deleted: " + path);
    }
}
