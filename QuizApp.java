/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;
import java.util.Scanner;
/**
 *
 * @author Frank Lee
 */
public class QuizApp {
    
    public static void main(String[] args) {
        int score = 0;
        Scanner keyBoard = new Scanner(System.in);
        
        System.out.println("Hello! What is your name");
        String name = keyBoard.nextLine();
        
        //State Question 1 to user
        System.out.println("\nWhat color is the sky?");
        //Collect user answer to Question 1
        String answerOne = keyBoard.nextLine();
        if (answerOne.equalsIgnoreCase("blue")) {
            System.out.println("Correct, " + name + ". You get one point!");
            score++;
            //If user answered correctly, they get "a point"
            System.out.println("You have answered " + score + " out of one question correctly");
        }
        else {
            System.out.println("Sorry, that answer is not correct.");
            System.out.println("You have answered " + score + " out of one question correctly");
        }
        //State Question 2
        System.out.println("\nWhat is 3 x 4?");
        //Collect user answer to Question 2
        int answerTwo = keyBoard.nextInt();
        if (answerTwo == 12) {
            System.out.println("Correct, " + name + ". You get one point!");
            score++;
            System.out.println("You have answered " + score + " out of two questions correctly");
        }
        else {
            System.out.println("Sorry, that answer is not correct.");
            System.out.println("You have answered " + score + " out of two questions correctly");
        }
        //State Question 3
        System.out.println("\nWhat is the most common letter in the English alphabet?");
        //This string will eat up whatever character keeps being set as answerThree
        String somethingWeirdWithMyCode = keyBoard.nextLine();
        //Now Collect user answer to Question 3
        String answerThree = keyBoard.nextLine();
        if (answerThree.equals("e")) {
            System.out.println("Correct, " + name + ". You get one point!");
            score++;
            System.out.println("You have answered " + score + " out of three questions correctly");
        }
        else {
            System.out.println("Sorry, that answer is not correct.");
            System.out.println("You have answered " + score + " out of three questions correctly");
        }
        //State Question 4
        System.out.println("\nWhat is the most common gas in our atmosphere?");
        //Now Collect user answer to Question 3
        String answerFour = keyBoard.nextLine();
        //Used the not statement from boolean or whatever, so the words are inverse this time? (!) 
        if (!answerFour.equalsIgnoreCase("Nitrogen")) {
            System.out.println("Sorry, that answer is not correct.");
            System.out.println("You have answered " + score + " out of four questions correctly");
        }
        else {
            System.out.println("Correct, " + name + ". You get one point!");
            score++;
            System.out.println("You have answered " + score + " out of four questions correctly");
        }
        //State Question 5
        System.out.println("\nWhat is the Beatles's most popular song?");
        //Now Collect user answer to Question 3
        String answerFive = keyBoard.nextLine();
        if (answerFive.equalsIgnoreCase("Hey Jude")) {
            System.out.println("Correct, " + name + ". You get one point!");
            score++;
            System.out.println("You have answered " + score + " out of five questions correctly");
        }
        else {
            System.out.println("Sorry, that answer is not correct.");
            System.out.println("You have answered " + score + " out of five questions correctly");
        }
        
        //End Quiz (with easter egg)
        if (score == 0) {
            System.out.println("\nDang, you're absurdly bad at this (I mean, 3x4 is literally 12), but hey! At least you found the easter egg,");
        }
        else {
            System.out.println("\nThat's the end! Thank you for quizzing!");
        }
    }
    
}
