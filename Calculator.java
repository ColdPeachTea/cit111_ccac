package addition_calculator;

//Import Scanner
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] Mojo) {
        
        //Input scanner and variables used
        Scanner inputScanner = new Scanner(System.in);  
        double magicNumberOne;
        double magicNumberTwo;
        double magicSum;
        
        //Subtraction sequence
        System.out.println("What do you require from the subtraction wizard!");
        System.out.println("Make this quick please...");
        System.out.println("Tell me your first number: ");
        magicNumberOne = inputScanner.nextDouble();
        System.out.println("Quick, tell me your second number so we can get this over with");
        magicNumberTwo = inputScanner.nextDouble();
        magicSum = magicNumberOne - magicNumberTwo;
        System.out.println("Kaboom! Your answer is: ");
        System.out.println(magicSum);
        
        
        //Addition sequence
        System.out.println("Greetings, I am the addition wizard!");
        System.out.println("An elder of the order of the calculator...");
        System.out.println("Tell me your first number: ");
        magicNumberOne = inputScanner.nextDouble();
        System.out.println("Okay, now tell me your second number: ");
        magicNumberTwo = inputScanner.nextDouble();
        magicSum = magicNumberOne + magicNumberTwo;
        System.out.println("Huzzah! With the power of addition magic, I present to you the answer you seek: ");
        System.out.println(magicSum);
        
        //Multiplication sequence
        System.out.println("I am the multiplication wizard!");
        System.out.println("The smartest wizard in the land...");
        System.out.println("Tell me your first number: ");
        magicNumberOne = inputScanner.nextDouble();
        System.out.println("Okay, now tell me your second number: ");
        magicNumberTwo = inputScanner.nextDouble();
        magicSum = magicNumberOne * magicNumberTwo;
        System.out.println("ZIP! With my experience and expertise in multiplication magic, I present to you the answer: ");
        System.out.println(magicSum);
        
        //Division sequence
        System.out.println("I am the division wizard.");
        System.out.println("...");
        System.out.println("Tell me your first number: ");
        magicNumberOne = inputScanner.nextDouble();
        System.out.println("Now tell me your second number: ");
        magicNumberTwo = inputScanner.nextDouble();
        magicSum = magicNumberOne / magicNumberTwo;
        System.out.println("...Your answer is...: ");
        System.out.println(magicSum);
   
    }  
}
