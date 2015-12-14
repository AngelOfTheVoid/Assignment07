
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       System.out.println("enter amount of students");
        Scanner input = new Scanner(System.in);
        //user input the amount of students
        int amount = input.nextInt();
        int out = amount -1;
        int[] marks = new int[amount];
        
        
        
        
        //sets the numbers the user enters into the array
        System.out.println("please enter the studens grades");
      for(int q = 0; q <amount; q++){
          marks[q] = input.nextInt();
      }
      
//runs the code  x times, where x is the number the user entered
        for (int i = 0; i < amount; i++) {
//takes the first number then cycles it though comparing the number to the others
//if the inital number is grater it will swap. if will do the same for the rest putting them in order             
            for (int p = 0; p < amount; p++) {
               if (marks[i] > marks[p]){
                   int temp = marks[i];
                   marks[i] = marks[p];
                   marks[p] = temp;
               }
            
                
                
            }

  
        }
     int average = 0;
        for(int k = 0; k <amount; k++){
          average = average + marks[k];
      }
        
        average = average / amount;
        System.out.println("lowest number is " + marks[out]);
        System.out.println("highest number is " + marks[0]);
        System.out.println("average " + average);
    
    
    
    }
}
