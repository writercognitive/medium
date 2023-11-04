// Proxy: ImageProxy
public class ImageProxy implements Image {
    private String imageFilePath;
    private HighResolutionImage realImage;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(imageFilePath);
        }
        realImage.display();
    }
}