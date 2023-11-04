// Client Code
public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, amplifier, screen);

        // Watch a movie
        homeTheaterFacade.watchMovie("Avengers: Endgame");

        // End the movie
        homeTheaterFacade.endMovie();
    }
}