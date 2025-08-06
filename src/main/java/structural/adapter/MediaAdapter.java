package structural.adapter;

import structural.adapter.target.MediaPlayer;
import structural.adapter.adaptee.AdvancedMediaPlayer;
import structural.adapter.adaptee.VlcPlayer;
import structural.adapter.adaptee.Mp4Player;

/**
 * MediaAdapter adapts AdvancedMediaPlayer to MediaPlayer.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}