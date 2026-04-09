package interfaces;

interface Playable {
    // The "Action" contract
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Football: Playing a match on a grass field with 11 players.");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Volleyball: Playing on a court with a net; using hands to hit the ball.");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Basketball: Playing on a court; dribbling and shooting into a hoop.");
    }
}