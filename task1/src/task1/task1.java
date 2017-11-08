package task1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.SocketPermission;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Enter a new string:");  // enter a ner string
        Scanner sc = new Scanner(System.in);
        String rev =sc.nextLine();
        String subSt = "";

        // flip a string
        String reverse = new StringBuffer(rev).reverse().toString();
        System.out.println(reverse);

        // each word a new string
        for (String ret : rev.split(" ")) {
            System.out.println(ret);
        }

        //replace enter by *
        System.out.println(rev.replace(' ', '*'));

        // method UpperCase
        System.out.println(rev.toUpperCase());

        // derivation a substring

        for (int i=4; i<10; i++) {
            if (i>= rev.length()) break;
            subSt = subSt + rev.charAt(i) ;
        }
        System.out.println(subSt);
    }
}
