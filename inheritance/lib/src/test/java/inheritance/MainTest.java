package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class MainTest {

    @Test
     void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("KFC",3,"$");
        String output = restaurant.toString();
        String expected = "Restaurant{name='KFC', numOfStars=3, priceCategory='$', review=[]}";
        Assertions.assertEquals(expected,output);
    }

    @Test public void testReviewToString() {
        Review rev = new Review("review 1","Deyaa",4);
        String output = rev.toString();
        String expected = "Review{body='review 1', author='Deyaa', numOfStars=4}";
        Assertions.assertEquals(expected,output);
    }
    @Test public void testAddReview() {
        Restaurant restaurant = new Restaurant("KFC",3,"$");
        Review rev = new Review("review 1","deyaa",5);
        restaurant.addReview(rev);
        restaurant.addReview(rev);
        String output = restaurant.toString();
        String expected = "Restaurant{name='KFC', numOfStars=5, priceCategory='$', review=[Review{body='review 1', author='deyaa', numOfStars=5}]}";
        Assertions.assertEquals(expected,output);
    }



    @Test
    public void testAddReviewEditStarsRating() {
        Restaurant test = new Restaurant("test", 3, "$");
        Review rev = new Review("review 1", "Mhd", 5);
        int oldStars = test.getNumOfStars();
        int expectedOldStars = 3;
        test.addReview(rev);
        int newStars = test.getNumOfStars();
        int expectedNewStars = 5;
        Assertions.assertEquals(expectedOldStars, oldStars);
        Assertions.assertEquals(expectedNewStars, newStars);
    }


    @Test
    public void ShopCreateInstance() {
        Shop testShop = new Shop("first shop", "the first shop in the app", 10);
        String output = testShop.toString();
        String expected = "Shop{name='first shop', description='the first shop in the app', numOfDollarSigns=10, reviews=[]}";
        Assertions.assertEquals(expected, output);
    }

    @Test
    public void testShopAddReview() {
        Review rev = new Review("review 1", "deyaa", 5);
        Shop testShop = new Shop("first shop", "the first shop in the app", 10);
        testShop.addReview(rev);
        String output = testShop.toString();
        String expected = "Shop{name='first shop', description='the first shop in the app', numOfDollarSigns=10, reviews=[Review{body='review 1', author='deyaa', numOfStars=5}]}";
        Assertions.assertEquals(expected, output);
    }

    @Test
    public void testTheater() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("bad boy");
        movies.add("The Shawshank Redemption");
        movies.add("pearl harbor");
        movies.add("Fast & furious");
        Theater testTheater = new Theater("first Theater", movies);
        String output = testTheater.toString();
        String expected = "Theater{name='first Theater', movies=[bad boy, The Shawshank Redemption, pearl harbor, Fast & furious], reviews=[]}";
        Assertions.assertEquals(expected, output);
    }

    @Test
    public void testTheaterAddReview() {
        Review rev = new Review("review 1", "deyaa", 5);
        Review rev2 = new Review("review 2", "mohammd", 5);
        ArrayList<String> movies = new ArrayList<>();
        movies.add("bad boy");
        movies.add("The Shawshank Redemption");
        movies.add("pearl harbor");
        movies.add("Fast & furious");
        Theater testTheater = new Theater("one", movies);
        testTheater.addReview(rev);
        String output = testTheater.toString();
        String expected = "Theater{name='one', movies=[bad boy, The Shawshank Redemption, pearl harbor, Fast & furious], reviews=[[bad boy, Review{body='review 1', author='deyaa', numOfStars=5}]]}";
        Assertions.assertEquals(expected, output);
        testTheater.addReview(rev2);
        expected = "Theater{name='one', movies=[bad boy, The Shawshank Redemption, pearl harbor, Fast & furious], reviews=[[bad boy, Review{body='review 1', author='deyaa', numOfStars=5}], [bad boy, Review{body='review 2', author='mohammd', numOfStars=5}]]}";
        output = testTheater.toString();
        Assertions.assertEquals(expected, output);
    }


}

   


