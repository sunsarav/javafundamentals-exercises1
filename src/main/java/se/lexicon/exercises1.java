package se.lexicon;
import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {


        //Average of 3 nums - 4

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int no1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int no2 = scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int no3 = scanner.nextInt();

        System.out.println("Expected Result:");
        System.out.println(no1+ "+" +no2+ "+" +no3+ "/" +3+ "=" +((no1+no2+no3)/3));

        //Hello username - 5

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " +name);

        //print +,*,/,- of 2 nums - 6

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.println("Expected Result");
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            if (num2 != 0) {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
            } else {
            System.out.println("Error: Division by zero");
            }
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

            scanner.close();*/

        //Convert seconds to hours, minutes and seconds

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Seconds: ");
        int sec = scanner.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.println("Expected Output: ");
        System.out.println(hours + ":" + minutes + ":" + seconds);





            }
        }







