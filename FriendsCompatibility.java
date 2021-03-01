/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package might_we_be_friends;
//Importing the scanner from Java
import java.util.Scanner;
/**
 *
 * @author me
 */
public class FriendsCompatibility {
    public static void main(String[] mojo) {
    
    //create storage containers
    
        int styleMeter = 0;
        final int STYLE_METER_THRESHOLD = 100;
        final int STYLE_METER_NEGATIVE_THRESHOLD = -40;
        Scanner inputScanner;
        boolean passedStyleMeter = false;
        int userAnswer = 0;
        
    //create the point system thingy
    
        final int QUESTION_YES_POINTS = 20;
        final int QUESTION_NO_POINTS = -20;
        
    //create scanner
    
        Scanner in = new Scanner(System.in);
    
    //begin
    
        System.out.println("Let's start!");
        System.out.println("May we be friends?");
        
    //question one
    
        System.out.println( " Question 1: Do you like playing video games?" );
        System.out.println( "Enter 1 for yes, or any other number for no" );
        
        //user asnwer sequence
            
            userAnswer = in.nextInt();
            
            if(userAnswer == 1) {
                System.out.println("That's pretty cool!");
                styleMeter = styleMeter + QUESTION_YES_POINTS;
                
                //question in question
                System.out.println("Do you play League of Legends?");
                System.out.println("Enter 1 for yes, or any other number for no");
                
                userAnswer = in.nextInt();
                    
                    if(userAnswer == 1) {
                        System.out.println("That's awesome! Me too!");
                        styleMeter = styleMeter + QUESTION_YES_POINTS;
                        
                    } else {
                        System.out.println("I don't blame you!");                        
                    }
                
            } else {
                System.out.println("Oh that's alright I guess");
                styleMeter = styleMeter + QUESTION_NO_POINTS;
            }
        
    //question two
        
        System.out.println("Do you like art?");
        System.out.println("Enter 1 for yes, or any other number for no");
        
        //user answer sequence
        
            userAnswer = in.nextInt();
            
            if(userAnswer == 1) {
                System.out.println("Yeah, same! I love art!");
                styleMeter = styleMeter + QUESTION_YES_POINTS;
                
                //question in question
                System.out.println("Do you create any art?");
                System.out.println("Enter 1 for yes, or any other number for no");
                
                userAnswer = in.nextInt();
                
                    if(userAnswer == 1) {
                        System.out.println("That's amazing, I love making art too!");
                        styleMeter = styleMeter + QUESTION_YES_POINTS;
                    
                    } else {
                        System.out.println("That's respectable");
                    }
                    
            } else {
                System.out.println("Well, maybe there's SOMETHING we have in common?");
                styleMeter = styleMeter + QUESTION_NO_POINTS;
            }
                    
    //question three
        
        System.out.println("Do you like food? I hope you like food");
        System.out.println("Enter 1 for yes, or any other number for no");
        
        //user answer sequence
        
            userAnswer = in.nextInt();
            
            if(userAnswer == 1) {
                System.out.println("Wow! Incidentally, I happen to like food as well!");
                styleMeter = styleMeter + QUESTION_YES_POINTS;
                
                //question in question
                    
                    System.out.println("Choose your favorite food from the ones provided in the list");
                    System.out.println("1: Pizza");
                    System.out.println("2: Pasta");
                    System.out.println("3: Fried Chicken");
                    System.out.println("4: Hummus");
                    System.out.println("5: Any type of sandwich");
                    
                    userAnswer = in.nextInt();
                    
                    if(userAnswer == 1) {
                        styleMeter = styleMeter + 10;
                        System.out.println("Who doesn't like pizza?");
                    } else if(userAnswer == 2) {
                        styleMeter = styleMeter + 5;
                        System.out.println("Pasta is alright");
                    } else if(userAnswer == 3) {
                        styleMeter = styleMeter + 30;
                        System.out.println("Wow! This is my favorite food too!");
                    } else if(userAnswer == 4) {
                        styleMeter = styleMeter + 10;
                        System.out.println("Hummus is delicious!");
                    } else if(userAnswer == 5) {
                        styleMeter = styleMeter + 20;
                        System.out.println("Fried chicken is my favorite food, most sandwiches are a very close second!");                       
                    }
            } else {
                System.out.println("Not going to lie, that's kinda wierd. It's a no from me.");
            }
                    
                        
            if(styleMeter > 120) {
                System.out.println("Wow! We have so much in common! We could be really good friends!");
            } else if(styleMeter < 0)
                System.out.println("We don't have a lot in common");
           
                    
        System.out.println("Program Finished! See below for your Style Meter!");          
        System.out.println("Style Meter: " + styleMeter);
        
        

    }    
}
