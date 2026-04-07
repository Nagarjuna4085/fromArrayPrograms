package ClassAndConstructor;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {

    ArrayList<String> songs;

    // Constructor
    MusicLibrary() {
        songs = new ArrayList<>();
    }

    // Add song
    public void addSong(String song) {
        songs.add(song);
    }

    // Remove song
    public void removeSong(String song) {
        if (!songs.remove(song)) {
            System.out.println(song + " not found in library!");
        }
    }

    // Play random song
    public void playRandomSong() {

        if (songs.isEmpty()) {
            System.out.println("No songs available!");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(songs.size());

        System.out.println("🎵 Now Playing: " + songs.get(index));
    }

    // Display all songs
    public void displaySongs() {
        System.out.println("Music Library: " + songs);
    }

    public static void main(String[] args) {

        MusicLibrary ml = new MusicLibrary();

        // Add songs
        ml.addSong("Shape of You");
        ml.addSong("Believer");
        ml.addSong("Blinding Lights");
        ml.addSong("Perfect");

        System.out.println("After Adding Songs:");
        ml.displaySongs();

        // Play random song
        System.out.println("\nPlaying Random Song:");
        ml.playRandomSong();

        // Remove a song
        ml.removeSong("Believer");

        System.out.println("\nAfter Removing Song:");
        ml.displaySongs();

        // Play again
        System.out.println("\nPlaying Random Song Again:");
        ml.playRandomSong();
    }
}
