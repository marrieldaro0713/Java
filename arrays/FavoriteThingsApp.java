package favoritethingsapp;

public class FavoriteThingsApp {

    public static void main(String[] args) {
        // 1. Mag-declare at mag-initialize ng String array na may 5 favorite things
        String[] favoriteThings = {"Pizza", "Video Games", "Music", "Coffee", "Books"};

        System.out.println("=== My Favorite Things ===");

        // 2. I-print ang bawat item na may numero (1 hanggang 5) gamit ang loop
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        // 3. I-print ang kabuuang haba ng array gamit ang .length
        System.out.println("\nTotal number of items in array: " + favoriteThings.length);
    }
}