import java.util.ArrayList;


public class Main{

public static void main(String[]args){
    Review[]reviews={
        new Review(4,"Good! Thx"),
        new Review(3, "Okay site"),
        new Review(5, "Great!"),
        new Review(2, "Poor! bad."),
        new Review(3, "")
    };
    ReviewAnalysis r = new ReviewAnalysis(reviews);
    System.out.println(r.getAverageRating());


    ArrayList <String> comments = new ArrayList<String>();
    System.out.println(r.collectComments());
}
}