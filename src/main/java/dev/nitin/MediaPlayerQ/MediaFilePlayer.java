package dev.nitin.MediaPlayerQ;

public class MediaFilePlayer {
    public static void playMedia(MediaFile mediaFile) {
        // Your code here
        System.out.println(mediaFile.getDetails());

        mediaFile.play();
    }


    public static void main(String[] args) {
        MediaFile audioFile = new AudioFile("Song Title", "Sonu Nigam", "audio.mp3");
        MediaFile videoFile = new VideoFile("Video Title", "video.mp4","30");

        playMedia(audioFile);
        playMedia(videoFile);
    }
}
