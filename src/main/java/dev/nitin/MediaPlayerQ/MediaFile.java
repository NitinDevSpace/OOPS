package dev.nitin.MediaPlayerQ;

public abstract class MediaFile {
    protected String fileName;
    protected String title;

    public MediaFile(String title, String fileName) {
        this.fileName = fileName;
        this.title = title;
    }

    public abstract void  play();

    public String  getDetails() {
        return "Title: " + title + ", File: " + fileName;
    }
}
