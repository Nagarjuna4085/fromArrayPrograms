package abstraction;

abstract class Instrument {
    // Parent variable - every instrument has a name
    protected String name;

    Instrument(String name) {
        this.name = name;
    }

    // Abstract methods - every instrument plays and tunes differently
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {
    
    Glockenspiel(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + ": Striking metal bars with mallets. *Ting Ting*");
    }

    @Override
    public void tune() {
        System.out.println(name + ": Checking if metal bars are warped or loose.");
    }
}

class Violin extends Instrument {
    
    Violin(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + ": Drawing a bow across the strings. *Vreee*");
    }

    @Override
    public void tune() {
        System.out.println(name + ": Turning the pegs to tighten the strings.");
    }
}