
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //allows user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("how many students? ");
        //user eners the amount of students
        int noStudents = input.nextInt();
        //makes a arry the amount of spaces didctated by the amount of students
        int[]marks = new int[noStudents];
        //the overall total after all the number are added
        int total = 0;
       
        //the user enters student grades one for every student 
        //that number is then added to a total
        for(int i =0; i <noStudents; i++){
            System.out.println("studens grade ");
            marks[i] = input.nextInt();
           
            total = total + marks[i];
             
        }
        
    //the total is devided by the number of sudent to get the average, witch is then outputted to screen
        double average = total / noStudents;
        System.out.println("the average is " +average);
    }
}
