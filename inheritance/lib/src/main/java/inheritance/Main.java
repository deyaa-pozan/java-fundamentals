package inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Restaurant test = new Restaurant("The first", 3, "$");
        System.out.println(test.toString());

        Review rev = new Review( "review 1", "marah", 5);
        Review rev3 = new Review( "review 3", "deyaa", 1);
        System.out.println(rev.toString());

        test.addReview(rev);
        test.addReview(rev3);

        System.out.println(test.toString());

        Shop testShop = new Shop("first shop", "the first shop in the app", 10);
        System.out.println(testShop);
        testShop.addReview(rev);
        testShop.addReview(rev3);
        System.out.println(testShop);


        ArrayList<String> movies = new ArrayList<>();
        movies.add("bad boy");
        movies.add("The Shawshank Redemption");
        movies.add("pearl harbor");
        movies.add("Fast & furious");

        Theater theater = new Theater("Theater1", movies);
        theater.addReview(rev3);
        theater.addReview(rev);
        theater.removeMovie("Fast & furious");
        theater.addMovie("dd");

        System.out.println(theater);

    }
}
