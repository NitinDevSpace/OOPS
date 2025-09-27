package dev.nitin.MediaPlayerQ;

public class VideoFile extends MediaFile {
    private final String duration;

    public VideoFile(String title, String fileName, String duration) {
        super(title, fileName);
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing Video File: " + fileName);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Duration: " + duration;
    }
}
