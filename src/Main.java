import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int num = 2;
//        String name = "dog";
//        System.out.println("I own " + num + " " + pluralize(name, num) + ".");
//


//        flipNHeads(6);
        

//        clock();


    }


    public static String pluralize(String word,int num){
           return  ((num == 1) ? word : word+"s");
    }


     public static void flipNHeads(int round){
        int count =0;
         for (int i = 0; i < round; i++) {
             double rnd = Math.random();
             if (rnd>=0.5) {
                 System.out.println("heads");
                 count++;
             }else {
                 System.out.println("tails");

             }
         }
         System.out.println("It took "+ round + pluralize(" flip", round)  +" to flip "+count+" head in a row.");
     }

    public static void clock() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }
    }


}
