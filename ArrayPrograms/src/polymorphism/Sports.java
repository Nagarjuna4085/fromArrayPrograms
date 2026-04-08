package polymorphism;

// Base Class
class Sports {
    public void play() {
        System.out.println("Playing a generic sport...");
    }
}

// Subclass 1
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Football: Dribbling the ball and scoring goals!");
    }
}

// Subclass 2
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Shooting hoops and slam dunking!");
    }
}

// Subclass 3
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing Rugby: Sprinting with the oval ball and scoring tries!");
    }
}