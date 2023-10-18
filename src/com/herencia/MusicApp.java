package com.herencia;

public class MusicApp {
    private MultimediaList multimediaList;
    private Disk disk;

    public MusicApp() {
        multimediaList = new MultimediaList(20);

        multimediaList.add(new Multimedia("Rap God", "Eminem", File.MP3, 4.35));
        multimediaList.add(new Multimedia("Stan", "Eminem", File.MP3, 3.44));
        multimediaList.add(new Multimedia("With Out Me", "Eminem", File.MP3, 3.50));
    }

    public void addMusic(String title, String author) {
        this.disk = new Disk(title, author, null, 0, null);
        multimediaList.add(new Multimedia(
                                            this.disk.getTitle(),
                                            this.disk.getAuthor(),
                                            this.disk.getFile(),
                                            this.disk.getDuration()));
    }

    @Override
    public String toString() {
        return this.multimediaList.toString();
    }
}
