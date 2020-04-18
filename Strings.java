import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        String C = (A.charAt(0) > B.charAt(0)) ? "Yes" : "No";
        System.out.println(C);


        char firstLetterOfA  = A.charAt(0);
        char FIRSTLETTEROFA = Character.toUpperCase(firstLetterOfA);

        char firstLetterOfB  = B.charAt(0);
        char FIRSTLETTEROFB = Character.toUpperCase(firstLetterOfB);
        
        
        System.out.print(FIRSTLETTEROFA + A.substring(1) + " " + FIRSTLETTEROFB + B.substring(1));

    }
}



