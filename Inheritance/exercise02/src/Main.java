public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Movies");
        playlist.addVideo("Legends of today");
        playlist.addVideo("Mitsos gun");
        playlist.addVideo("King Of Games");
        playlist.addVideo("Retarder braaather from an other mother");
        playlist.addVideo("Xazolarides");
        playlist.print();

        System.out.println("----------------------------------------------");

        PlaylistTutorial playlisttutorial = new PlaylistTutorial("C++ Tutorials","programming");
        playlisttutorial.addVideo("video01");
        playlisttutorial.addVideo("video02");
        playlisttutorial.addVideo("video03");
        playlisttutorial.print();

        System.out.println("----------------------------------------------");

        System.out.println("Recommendation: "+playlist.recommendation());
        System.out.println("Recommendation: "+playlisttutorial.recommendation());

    }
}
