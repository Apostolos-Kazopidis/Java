import java.util.Random;

class Playlist {
    public String title;
    public String[] videos;
    public int nVideos;

    public Playlist(String title) {
        this.title = title;
        videos = new String[10];
        nVideos = 0;
    }

    public void addVideo(String video) {
        if (nVideos==10)
            System.out.println("Error: Maximum is 10!");
        else {
            videos[nVideos] = video;
            nVideos++;
        }
    }

    public String recommendation() {
        Random r = new Random();
        if (nVideos==0) {
            System.out.println("No recommendation!");
            return null;
        }
        else
            return videos[r.nextInt(nVideos)];
    }

    public String toString() {
        String s = "";
        s += title + "\n";
        s += "=================" + "\n";
        for (int i=0; i<nVideos; i++)
            s += videos[i] + "\n";

        return s;
    }
}