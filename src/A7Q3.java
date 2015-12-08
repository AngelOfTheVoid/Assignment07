
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter two numbers");
        Scanner input = new Scanner(System.in);
    int[]num = new int[2];
   //user input 2 numbers into the array
    for(int i = 0; i < 2; i++ ){
        num[i] = input.nextInt();
    }
    //sets a temp number to store a number from the array
    int temp = 0;
   //if the first number is grater then the other they will swap. if not then it's already in order
    if(num[0] > num[1]){
        temp = num[1];
        num[1] = num[0];
        num[0] = temp;
        
    }
   
    //outputs the array
   for(int k = 0; k<2; k++){
       System.out.println(num[k]);
   } 
   
    }
}
