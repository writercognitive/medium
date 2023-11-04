// Client Code
public class MediaPlayerClient {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new VideoPlayerAdapter(new ThirdPartyVideoPlayer());

        // Using the Media Player with Audio Files
        mediaPlayer.playAudio("song.mp3");
    }
}