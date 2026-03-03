package se.lexicon;
import java.util.Random;
import java.util.Scanner;

public class exercises1 {
    static void main(String[] args) {

        //Print Hello and my name - 1

        System.out.println("Hello");
        System.out.println("Sham");

        //Print leap year or not - 2

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to check leap or not: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }

        //Print +,*,/ and - of 2 numbers - 3

        System.out.println("Expected result: ");
        System.out.println("45 + 11 = " +(45 + 11));
        System.out.println("12 * 4 = " +(12 * 4));
        System.out.println("24 / 6 = " +(24 / 6));
        System.out.println("55 - 12 = " +(55 - 12));*/

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

        //Print +,*,/,- of 2 nums - 6

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

        //Convert seconds to hours, minutes and seconds - 7

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Seconds: ");
        int sec = scanner.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.println("Expected Output: ");
        System.out.println(hours + ":" + minutes + ":" + seconds);*/

        //Random guessing number - 8
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(500) + 1;
        int userGuess = 0;
        int count = 0;

        while (userGuess != randomNumber) {
            System.out.println("Guess the number: ");
            userGuess = scanner.nextInt();
            count++;

            if (userGuess == randomNumber) {
                System.out.println("Success after " + count + "guesses");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess was too big");
            } else {
                System.out.println("Your guess was too small");
            }
        }
        scanner.close();
        }
        }















