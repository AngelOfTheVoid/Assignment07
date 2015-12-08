import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //allows user imput
        Scanner input = new Scanner(System.in);
        System.out.println("how many people");
        //user inputs the the number of people  
        int noPeople = input.nextInt();
        //makes new array to store heights
        int[] heights = new int[noPeople];
        System.out.println("please enter the heights");
       
        for(int i =0; i<noPeople; i++){
          heights[i] = input.nextInt();
          
        }
    
        int total = 0;
        for(int q = 0; q<noPeople; q ++){
            total = total + heights[q];
        }
    
        total = total / noPeople;
        System.out.println("the average height is "+ total);
        
        for(int e = 0; e<noPeople; e++ ){
            int outAbove = heights[e];
            if(outAbove >total ){
                System.out.println(outAbove);
            }
        }
    
    }
}
