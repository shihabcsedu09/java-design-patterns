package structural.adapter.adaptee;

/**
 * AdvancedMediaPlayer is the adaptee interface for the Adapter pattern.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}