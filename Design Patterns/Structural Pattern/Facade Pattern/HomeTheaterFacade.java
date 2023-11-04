// Facade Class: HomeTheaterFacade
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Amplifier amplifier;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Amplifier amplifier, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.amplifier = amplifier;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        amplifier.on();
        dvdPlayer.on();
        System.out.println("Playing movie: " + movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
    }
}