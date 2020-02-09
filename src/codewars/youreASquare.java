package codewars;

import java.util.Scanner;

//Given an integral number, determine if it's a
// square number
public class youreASquare {
    public static void main(String[] args) {
        System.out.println("Please, enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;
        if(Math.pow(sqrt,2) == Math.pow(x,2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

