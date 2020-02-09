package codewars;

import java.util.Scanner;

// Write a function that accepts an array of 10
//integers(between 0 and 9), that returns a
//string of those numbers in the form of a phone number.
//createPhoneNumber([1,2,3,4,5,6,7,8,9,0]) // => returns "(123) 456-7890"
public class createPhone {
    public static void main(String[] args) {
       createPhoneNumber createPhNbr = new createPhoneNumber();
       Scanner sc =  new Scanner(System.in);
       int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
       createPhNbr.createPhoneNumber(arr);
    }
}

    class createPhoneNumber {
     void createPhoneNumber(int [] arr){
        System.out.println("(" + arr[0] + arr[1] + arr[2] + ") " + arr[3] + arr[4] + arr[5] + "-" +
                        arr[6] + arr[7] + arr[8] + arr[9]);
    }
}

