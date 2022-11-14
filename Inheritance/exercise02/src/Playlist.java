import java.util.Random;

public class Playlist {
    public String title;
    public String[] videos;

    public int nVideos;

    Playlist(String title) {
        this.title = title;
        videos = new String[10];
        nVideos = 0;
    }

    public void addVideo(String video) {
        if (nVideos == 10)
            System.out.println("ERROR....maximum is 10 videos");
        else {
            videos[nVideos] = video;
            nVideos++;
        }
    }

    public String recommendation() {
        Random r = new Random();

        return videos[r.nextInt(nVideos)];
    }

    public void print() {
        System.out.println("Title: "+title);
        for (int i=0; i<nVideos; i++)
            System.out.println(videos[i]);
    }













}
