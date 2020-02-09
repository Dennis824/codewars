package codewars;


// white a function to convert a name into initials. This kata strictly takes two words with
// one space in between them.
// The output should be two capital letters with a dot seperating them.

import java.util.Scanner;

public class abbreviateATwoWordName {
    public static void main(String[] args){
        System.out.println("enter your name please");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().toUpperCase();
        StringBuilder SB = new StringBuilder();
        SB.append(name.charAt(0));
        SB.append('.');
        for (int i = 0; i<name.length(); i++){
            if(name.charAt(i)==' '){
                SB.append(name.charAt(i+1));
            }
        }

        System.out.println(SB);
    }
}
