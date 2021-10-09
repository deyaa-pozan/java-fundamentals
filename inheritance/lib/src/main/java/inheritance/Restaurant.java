package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable{
    private String name;
    private int numOfStars;
    private String priceCategory;

    private ArrayList<Review> list=new ArrayList<Review>();


    public Restaurant(String name, int numOfStars, String priceCategory) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        if(numOfStars >= 0 && numOfStars <=5){
            int sum = 0;
            for(int i = 0; i < list.size(); i++){
                sum += list.get(i).getNumOfStars();
            }

            this.numOfStars = sum/list.size();
        }


    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList<Review> getReview() {
        return list;
    }
    @Override
    public void addReview(Review review) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAuthor().equals(review.getAuthor())){
               return;
            }
        }
        list.add(review);
        this.setNumOfStars(review.getNumOfStars());


    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", priceCategory='" + priceCategory + '\'' +
                ", review=" + list+
                '}';
    }


}