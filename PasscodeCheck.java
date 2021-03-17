
package project2_passcode_check;

import java.util.Scanner;

public class PasscodeCheck {
    public static void main(String[] mojo) {
        
        //Create a scanner
                Scanner scan = new Scanner(System.in);
        //The passcode
                final int PASSCODE = 4172002;
        //Create user code, this is typed in.
                int userCode;
        //Set attempts variable
                int attempt = 0;
        //Create attempt limit variable
                final int ATTEMPT_LIMIT = 5;
                    //Program starts
                    System.out.println("There is a stone with seven square indentations engraved on it");
                    System.out.println("There are also seven stone tiles with numbers engraved on them lying next to the stone");
                    System.out.println("2");
                    System.out.println("0");
                    System.out.println("2");
                    System.out.println("0");
                    System.out.println("7");
                    System.out.println("4");
                    System.out.println("1");
                    System.out.println("Place the tiles in the correct order to unlock the secret of the stone");
                    System.out.println("Place the stones in order by typing them in, do not use spaces or any value not listed above");
                        //Create attempt loop
                        while(attempt < ATTEMPT_LIMIT) {
                            //User types
                            userCode = scan.nextInt();
                            //If the user code is correct
                            if (userCode == PASSCODE) {
                                System.out.println("The rock shatters revealing a water gem, a lightning gem and a magically inscribed letter");
                                System.out.println("The letter reads");
                                System.out.println("Congradulations, you have solved the rock riddle");
                                System.out.println("Take these rare gems in celebration");
                                System.out.println("You take the gems and the letter vanishes into thin air");
                                break;
                            } else { 
                            //If the user code is incorrect
                                System.out.println("The stones fall out immediately");
                                System.out.println("That can't be right, time to  try again");
                                attempt = attempt + 1;
                            //If the user passes two attempts
                            } if (attempt > 2) {
                                System.out.println("An annoying voice fills your head");
                                System.out.println("The four final tiles are 2002");
                                System.out.println("Was that the rock?");
                                //If the user runs out of attempts
                                } if (attempt > ATTEMPT_LIMIT) {
                                    System.out.println("The engraved stone shatters into a fine dust");
                                    System.out.println("The tiles also shatter into dust");
                                    System.out.println("You are suddenly very sad");
                                            
                                        
                                }
                            }
                        
                        }
}