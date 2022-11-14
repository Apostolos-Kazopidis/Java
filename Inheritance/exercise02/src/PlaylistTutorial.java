import java.util.Random;

public class PlaylistTutorial extends Playlist{
    String subject;

    PlaylistTutorial(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    public String recommendation() {
        if (nVideos==0) {
            System.out.println("no recommendation");
            return null;
        }
        else
            return videos[0];
    }

    public void print() {
        System.out.println("Title: "+title+" Subject: "+subject);
        for (int i=0; i<nVideos; i++)
            System.out.println(videos[i]);
    }
}
