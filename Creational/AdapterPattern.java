interface MediaPlayer {
    void play(String audioType, String fileName);
}

class MP3Player implements MediaPlayer {
    public void play(String audioType, String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    MP3Player mp3Player = new MP3Player();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.play(audioType, fileName);
        }
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("mp3", "song.mp3");
    }
}
