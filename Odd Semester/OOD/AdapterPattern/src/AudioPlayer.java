public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Mp3 player file Name: "+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType,fileName);
            mediaAdapter.play(audioType, fileName);

        }
    }
}
