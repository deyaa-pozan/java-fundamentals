package inheritance;

import java.util.*;

public class Theater implements Reviewable {

    String name;
    ArrayList<String> movies = new ArrayList<>();
    ArrayList<Object> reviews = new ArrayList<>();
    Object[] rev=new Object[2];

    // Allocating memory for 2 objects
    // of type student


    public Theater(String name, ArrayList<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }
    @Override
    public void addReview(Review review) {
        rev[0]=this.movies.get(0);
        rev[1]=review;

        reviews.add(Arrays.toString(rev));
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", reviews=" + reviews +
                '}';
    }


}
