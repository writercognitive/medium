// Real Subject: HighResolutionImage
public class HighResolutionImage implements Image {
    private String imageFilePath;

    public HighResolutionImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + imageFilePath);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageFilePath);
    }
}