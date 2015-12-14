/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //sets all 10 slots of marks as a number
        int[] marks = new int[10];
        marks[0] = 67;
        marks[1] = 79;
        marks[2] = 45;
        marks[3] = 67;
        marks[4] = 78;
        marks[5] = 69;
        marks[6] = 30;
        marks[7] = 76;
        marks[8] = 89;
        marks[9] = 80;
      
//runs the code under 10 times
        for (int i = 0; i < 10; i++) {
//takes the first number then cycles it though comparing the number to the others
//if the inital number is less it will swap. if will do the same for the rest putting them in order             
            for (int p = 0; p < 10; p++) {
               if (marks[i] < marks[p]){
                   int temp = marks[i];
                   marks[i] = marks[p];
                   marks[p] = temp;
               }
            
                
                
            }

  
        }
        //out puts all the numbers in the array to screen
for(int k = 0; k <10; k++){
    System.out.println(marks[k]);
}


    }
}
