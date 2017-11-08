package task3;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size;
        size = sc.nextInt() - 2;
        String left = "";

       for (int i = 0; i <= size; i ++) left += ' ';

        System.out.println(left + '*');
        for (int i = 0; i <= size*2 ; i ++) {
            String leftPad = "";
            String innerPad = " ";
            int k = (i <= size) ? i : (size * 2 - i);

            for (int j = 0; j <= size - k - 1; j ++) leftPad += ' ';
            for (int j = 0; j < k; j ++) innerPad += "  ";

            System.out.println(leftPad + '*' + innerPad + '*');
        }
        System.out.println(left + '*');
    }
}
