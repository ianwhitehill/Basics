import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Basics");
        //Print 1-255
        // Write a method that prints all the numbers from 1 to 255.
        for(int i = 1; i <= 255; i++){
            // System.out.println(i);
        }
        // Print odd numbers between 1-255
        // Write a method that prints all the odd numbers from 1 to 255.
        for(int i = 1; i <= 255; i++){
            if(i == 1 || i%2 == 1){
                // System.out.println(i);
            }
        }
        // Sigma of 255 AKA Sum to 255
        // Write a method that creates and eventually returns a sum variable that adds up all the numbers from 1 to 255. In this method you are not printing the sum, except to debug if you need to, the method should return the sum. Note: You do not need an array to write this function. 
        int sigma = 0;
        for(int i = 1; i <= 255; i++){
            sigma += i;
        }
        //System.out.println(sigma);
        // Iterating through an array
        // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
        int[] X = {1,3,5,7,9,13};
        for(int i : X){
            // System.out.println(i);
        }
        // Find Max
        // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
        int max = 0;
        for(int i = 0; i < X.length; i++){
            if(i == 0){
                max = X[i];
            }
            if(X[i] > max){
                max = X[i];
            }
        }
        System.out.println(max);
        // Array with Odd Numbers 
        // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++){
            if(i == 1 || i%2 == 1){
                y.add(i);
            }
        }
    }
}
