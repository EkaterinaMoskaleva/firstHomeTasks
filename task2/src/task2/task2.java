package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Enter the day number:");
        Scanner num = new Scanner(System.in);
        int number =num.nextByte();
        int i = 1;
        String dayString;

            switch (number) {
                case 1:
                    dayString = "Monday";
                    break;
                case 2:
                    dayString = "Tuesday";
                    break;
                case 3:
                    dayString = "Wednesday";
                    break;
                case 4:
                    dayString = "Thursday";
                    break;
                case 5:
                    dayString = "Friday";
                    break;
                case 6:
                    dayString = "Saturday";
                    break;
                case 7:
                    dayString = "Sunday";
                    break;
                default:
                    dayString = "Enter a number from 1 to 7";
                    break;
            }
        System.out.println(dayString);
    }
}
