package stringprograms;

public class CheckSameData {
    public static void main(String[] args) {
        String author = "Stephen Edwin King";
        String critic1 = "Walter Winchell";
        String critic2 = "Mike Royko";

        // 1. Comparing Stephen King to Walter Winchell
        boolean match1 = author.equals(critic1);
        System.out.println("\"" + author + "\" equals \"" + critic1 + "\"? " + match1);

        // 2. Comparing Stephen King to Mike Royko
        boolean match2 = author.equals(critic2);
        System.out.println("\"" + author + "\" equals \"" + critic2 + "\"? " + match2);
        
        // 3. Proving it works for a perfect match
        String duplicate = "Stephen Edwin King";
        System.out.println("\"" + author + "\" equals \"" + duplicate + "\"? " + author.equals(duplicate));
    }
}