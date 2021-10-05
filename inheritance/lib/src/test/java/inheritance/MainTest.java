package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
     void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("KFC",3,"$");
        String output = restaurant.toString();
        String expected = "Restaurant{name='KFC', numOfStars=3, priceCategory='$', review=[]}";
        Assertions.assertEquals(expected,output);
    }

    @Test public void testReviewToString() {
        Restaurant restaurant = new Restaurant("KFC",3,"$");
        Review rev = new Review(restaurant,"review 1","Deyaa",4);
        String output = rev.toString();
        String expected = "Review{body='review 1', author='Deyaa', numOfStars=5, restaurant=The first}";
        Assertions.assertEquals(expected,output);
    }
    @Test public void testAddReview() {
        Restaurant restaurant = new Restaurant("KFC",3,"$");
        Review rev = new Review(restaurant,"review 1","Mhd",5);
        restaurant.addReview(rev);
        String output = restaurant.toString();
        String expected = "Restaurant{name='KFC', numOfStars=5, priceCategory='$', review=Review{body='review 1', author='Deyaa', numOfStars=5, restaurant=KFC}}";
        Assertions.assertEquals(expected,output);
    }

   


}