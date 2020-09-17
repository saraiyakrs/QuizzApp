package quizapp;
import java.util.Scanner;
/**
 *
 * @author Krishna Saraiya
 */
public class QuizApp {

       public static void main(String[] args) {
           int score = 0;  
           Scanner kboard = new Scanner(System.in);
           
           System.out.println("Hello");
           System.out.println("What color is the sky?");
           String answer1 = kboard.nextLine();
           if(answer1.equals("blue")) {
               //give them a point
               score++;
               System.out.println("correct!");
          
           }
           else {
               System.out.println("What planet are you living on?");
               String answer2 = kboard.nextLine();
               if(answer2.equals("Earth")) {
                   //give another point
                   score++;
                   System.out.println("Correct!");
           }
           else {
               System.out.println("What galaxy do we live in?");
               String answer3 = kboard.nextLine();
               if(answer3.equals("Milky Way")) {
                   //give another point
                   score++;
                   System.out.println("Correct!"); 
           
           }
               else {
               System.out.println("Does the Earth have a moon?");
               String answer4 = kboard.nextLine();
               if(answer3.equals("Yes")) {
                   //give another point
                   score++;
                   System.out.println("Correct!"); 
           
            }
               else {
               System.out.println("How many planets are in the solar system");
               String answer5 = kboard.nextLine();
               if(answer3.equals("8")) {
                   //give another point
                   score++;
                   System.out.println("Correct!"); 
                
                   //Score 
            }
               
               
            }
         
           
    }
    
}
