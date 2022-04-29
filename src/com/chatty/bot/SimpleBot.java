package com.chatty.bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("TontoBot", "2020");
        remindName();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    private static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    private static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        question1();
//        question2();
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }

    static void question1() {
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To determine the execution time of a program.");
        System.out.println("3. To interrupt the execution of a program.");
        System.out.println("4. To decompose a program into several small subroutines.");
        checkAnswer(4);
    }

    static void question2() {
        System.out.println("What does the 'break' statement do?");
        System.out.println("1. Breaks the program into pieces.");
        System.out.println("2. Stops executing the current loop.");
        System.out.println("3. Quits the program.");
        System.out.println("4. Breaks the program flow.");
        checkAnswer(2);
    }

    static void checkAnswer(int answer) {
        int guess = 0;
        while (guess != answer) {
            guess = scanner.nextInt();
            if (guess != answer) {
                System.out.println("Please, try again.");
            }
        }
    }
}
