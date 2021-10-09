package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable {
    String name;
    String description;
    int numOfDollarSigns;
    private ArrayList<Review> list=new ArrayList<Review>();

    public ArrayList<Review> getReview() {
        return list;
    }

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public ArrayList<Review> getList() {
        return list;
    }

    public void setList(ArrayList<Review> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                ", reviews=" + list +
                '}';
    }

@Override
    public void addReview(Review review) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAuthor().equals(review.getAuthor())) {
                return;
            }
        }
    list.add(review);
    }




}


