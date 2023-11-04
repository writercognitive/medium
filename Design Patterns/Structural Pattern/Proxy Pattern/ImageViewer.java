// Client Code
public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("sample1.jpg");
        Image image2 = new ImageProxy("sample2.jpg");

        // High-resolution images will be loaded and displayed only when needed.
        image1.display();
        image2.display();
        image1.display(); // The image is already loaded, so it will be displayed directly.
    }
}