package ClassAndConstructor;

import java.util.ArrayList;

public class Movie {

    String title;
    String director;
    ArrayList<String> actors;
    ArrayList<String> reviews;

    // Constructor
    Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Add actor
    public void addActor(String actor) {
        actors.add(actor);
    }

    // Add review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Get all reviews
    public void getReviews() {
        System.out.println("Reviews for " + title + ":");
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
            return;
        }

        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }

    // Display movie details
    public void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Create movie object
        Movie m1 = new Movie("Inception", "Christopher Nolan");

        // Add actors
        m1.addActor("Leonardo DiCaprio");
        m1.addActor("Joseph Gordon-Levitt");
        m1.addActor("Ellen Page");

        // Add reviews
        m1.addReview("Amazing movie with deep concept!");
        m1.addReview("Mind-blowing visuals and story.");
        m1.addReview("One of the best sci-fi movies.");

        // Display movie details
        m1.displayMovie();

        // Retrieve reviews
        m1.getReviews();
    }
}