class PlaylistTutorial extends Playlist {
    String subject;

    public PlaylistTutorial(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    public String recommendation() {
        if (nVideos==0) {
            System.out.println("No recommendation!");
            return null;
        }
        else
            return videos[0];
    }
}
