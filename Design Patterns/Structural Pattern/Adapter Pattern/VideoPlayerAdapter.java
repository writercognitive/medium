// Adapter for ThirdPartyVideoPlayer
public class VideoPlayerAdapter implements MediaPlayer {
    private ThirdPartyVideoPlayer videoPlayer;

    public VideoPlayerAdapter(ThirdPartyVideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void playAudio(String audioFile) {
        // The adapter method converts the audio file to a temporary video format and calls the playVideoFile method of the video player.
        String temporaryVideoFile = convertAudioToVideo(audioFile);
        videoPlayer.playVideoFile(temporaryVideoFile);
    }

    private String convertAudioToVideo(String audioFile) {
        // Simulate audio to video conversion logic
        return audioFile + ".mp4";
    }
}