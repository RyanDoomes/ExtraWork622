import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

    public class arraySwap {
        public static void main(String[] args) {

            //Prompt user to enter number greater than 10

            System.out.println("Please enter a number greater than 10: ");
            Scanner input = new Scanner(System.in);

            //Assign user input to int named n
            int n = input.nextInt();

            //error check to make sure number entered is greater than 10
            while (n<=10){
                System.out.println("Try Again! Please enter a number greater than 10: ");
                n = input.nextInt();
            }

            //Create an array the length of "n"

            int[] arr = new int[n];

            //Assign random numbers to the array


            for(int i=0; i<=arr.length-1; i++){
                int randomNum = ThreadLocalRandom.current().nextInt(2, 75 + 1);
                arr[i] = randomNum;

            }
            System.out.print("Before Swap: ");
            System.out.println(Arrays.toString(arr));

            //Print Sum of indexes 2,	5,	7	and	9.
            int sum = (arr[2] + arr[5] + arr[7] + arr[9]);
            System.out.println("Sum of indexes 2,5,7 and 9: " +sum);
            System.out.println("");

            //Swap elements at indexes 2 & 6
            int temp = arr[2];
            arr[2] = arr[6];
            arr[6] = temp;

            //Swap elements at indexes 4 & 7
            temp = arr[4];
            arr[4] = arr[7];
            arr[7] = temp;

            System.out.print("After swap: ");
            System.out.println(Arrays.toString(arr));

            //Print Sum of indexes 2,	5,	7	and	9.
            int sum2 = (arr[2] + arr[5] + arr[7] + arr[9]);
            System.out.println("Sum of indexes 2,5,7 and 9: " +sum2);





        }

    }

