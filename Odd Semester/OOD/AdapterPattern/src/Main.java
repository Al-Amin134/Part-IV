//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();
    audioPlayer.play("mp3","nazrul.mp3");
    audioPlayer.play("mp4", "modern.mp4");
    audioPlayer.play("vlc","dance.vlc");
    }
}