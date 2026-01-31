public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 Player file name: "+fileName);
    }
}
