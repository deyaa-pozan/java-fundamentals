/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import java.util.;

public class Library {

    public int[] roll(int n){
        if(n<0){n= 0;}

        int[] outputArray = new int[n];
        Random random = new Random();

        for (int i= 0; i < n ; i++){
            int randBetween1and6 = random.nextInt(6)+1;
            outputArray[i]=randBetween1and6;
        }
        return outputArray;
    }

    public boolean containsDuplicates (int[] arr){
        Set<Integer> set = new HashSet<Integer>();
        for ( int i = 0; i < arr.length; ++i ) {
            if ( set.contains( arr[i])) {
                return true;
            }
            else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public  double getAvg(int[] arr){
        if(arr.length==0) return 0;
        if(arr.length ==1) return arr[0];
        double sum=0;
        double avg =0;
        int size = arr.length;
        for (int x:arr){
            sum+=x;
        }
        avg = sum/size;
        return avg;
    }

    public int[] lowestAvg(int[][]arr){
        double currentAvg=0;
        double lowAvg=0;
        int numberOfLowestArray=0;

        lowAvg = getAvg(arr[0]);

        for(int i =1 ; i< arr.length; i++){

            currentAvg= getAvg(arr[i]);
            if(lowAvg>currentAvg){
                lowAvg=currentAvg;
                numberOfLowestArray=i;
            }

        }
        return arr[numberOfLowestArray];
    }




}