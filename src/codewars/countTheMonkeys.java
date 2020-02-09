package codewars;

import java.util.Scanner;

//Given the number (n), populate an array  with all numbers up to and including that number,
//but excluding zero
public class countTheMonkeys {
    public static void main(String[] args){
        System.out.println("Please, enter number of monkeys");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("There is no monkeys here");
        }

        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}
