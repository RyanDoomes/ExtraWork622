import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //	prompt the user	to	enter	a	positive	integer	n
        System.out.print("Please enter a positive number: ");
        int n = input.nextInt();

        //error check for int n
        while(n<=0){
            System.out.println("Try Again! Number must be positive: ");
            n = input.nextInt();
        }

        //creating integer array the length of int n

        int[] arr = new int[n];

        //fill in array with random numbers between 1 and 500

        for (int i = 0; i <= arr.length - 1; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 500 + 1);
            arr[i] = randomNum;
        }

        //Print array on one line
        System.out.println("Array on one line: ");
        System.out.println(Arrays.toString(arr));

        //Print Max Number to Console
        System.out.println("Maximum: " + getMax(arr));

        //Print Min Number to Console
        System.out.println("Minimum: " + getMin(arr));

        //Print Sum to Console
        System.out.println("Sum: " + sumValues(arr));

        //Print Avg to Console
        System.out.println("Average: " +getAverage(arr));

        //Print the Amount of numbers greater than Avg
        System.out.println("Number of integers greater than average: "+ greaterThanAverage(arr));

        //Print subsequent values increase amount
        System.out.println("Number of times subsequent value increases: " + countInc(arr));

        //Amount of times number gets smaller
        System.out.println("Number of times subsequent value decreases: " + countDec(arr));

        //Print array 3 per line
        printArray3PerLn(arr);




    }

//Methods

    //Max Number in Array
    public static int getMax(int[] x) {
        int temp = x[0];

        for(int i=0; i<x.length; i++){

            if (temp < x[i])
                temp = x[i];

        }
        return temp;
        }

    //Min Number in Array
    public static int getMin(int[] x) {
        int temp = x[0];

        for(int i=0; i<x.length; i++){

            if (temp > x[i])
                temp = x[i];

        }
        return temp;
    }

    //Sum Values in Array

    public static int sumValues(int[] x) {

        int sum = 0;
        for(int i=0; i<x.length; i++){
            sum += x[i];
        }
        return sum;
    }

    //Average values in Array

    public static int getAverage(int[] x) {

        int sum = 0;

        for(int i=0; i<x.length; i++){
        sum += x[i];
        }
        int avg = sum/x.length;
        return avg;
    }

    //Greater than Average

    public static double greaterThanAverage(int[] a){
        int count = 0;
        int avg = getAverage(a);
        for(int i = 0; i < a.length; i++){
            if(a[i] > avg){
                count++;
            }
        }
        return count;
    }

    // find how many nums that next value is bigger
    public static int countInc(int[] a){
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i+1] > a[i]){
                count++;
            }
        }
        return count;
    }

    // count how many when next num is smaller
    public static int countDec(int[] a){
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                count++;
            }
        }
        return count;
    }
        //print array 3 elements per line
    public static void printArray3PerLn(int[] a){
        int lineCount = 0;
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            lineCount++;
            if (lineCount == 3) {
                System.out.println();
                lineCount = 0;
            }
        }
    }


}





