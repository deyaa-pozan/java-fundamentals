package inheritance;

public class Main {
    public static void main(String[] args) {
        Restaurant test = new Restaurant("The first",5,"$$$$");
        Restaurant test2 = new Restaurant("The second",3,"$$$$");

        Review rev = new Review(test,"review 1","maher",4);
        Review rev1 = new Review(test,"review 2","deyaa",4);
        Review rev2 = new Review(test,"review 3","mazen",3);
        Review rev3 = new Review(test,"review 3","mazen",1);
        Review rev4 = new Review(test,"review 3","mazen",1);

        System.out.println(test);



        test.addReview(rev);
        test.addReview(rev1);
        test.addReview(rev2);
        test.addReview(rev3);
        test.addReview(rev4);
        test2.addReview(rev4);
        test2.addReview(rev1);

        System.out.println(test);
        System.out.println(test.getNumOfStars());





    }
}
