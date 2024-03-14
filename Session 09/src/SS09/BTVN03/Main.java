package SS09.BTVN03;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        System.out.println(audioPlayer.play());

        VideoPlayer videoPlayer = new VideoPlayer();
        System.out.println(videoPlayer.play());
    }
}
