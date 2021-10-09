package inheritance;

public class Review  {
    private String body;
    private String author;
    private int numOfStars;



    public Review( String body, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }



    public String getAuthor() {
        return author;
    }


    public int getNumOfStars() {
        return numOfStars;
    }


    public void setNumOfStars(int numOfStars) {
        if(numOfStars >= 0 && numOfStars <=5){
            this.numOfStars = numOfStars;
        }
        else
            this.numOfStars =1;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }
}