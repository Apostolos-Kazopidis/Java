public class Main {

    public static void main(String[] args) {
        Playlist p = new Playlist("Philosophy Lessons");

        p.addVideo("Socrates' Philosophy");
        p.addVideo("Plato's Philosophy");
        p.addVideo("Democritus's Philosophy");
        p.addVideo("Thales's Philosophy");
        p.addVideo("Pythagoras's Philosophy");
        System.out.println(p);

        System.out.println("\nRecommendation: " + p.recommendation() +"\n");

        PlaylistTutorial t = new PlaylistTutorial("Java Tutorial", "programming");
        t.addVideo("Video 01");
        t.addVideo("Video 02");
        t.addVideo("Video 03");
        System.out.println(t);

        System.out.println("\nRecommendation: " + t.recommendation() +"\n");

    }
}
