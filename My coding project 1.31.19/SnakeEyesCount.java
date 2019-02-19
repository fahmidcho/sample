/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

/**
 *
 * @author fahmi
 */
public class SnakeEyesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int die1, die2;
        int count = 0;
        
        boolean roll_dice = true;
        
        while (roll_dice) {
            die1 = (int)(Math.random()*6)+ 1;
            die2 = (int)(Math.random()*6)+ 1; 
            
            count++;
            
            if (die1 == 1 && die2 == 1) {
                break;
                
            }
        }
        
        System.out.println("# of counts taken :" + count + "to simulate the snake eyes" );
        
        // Challege:
        int chal_count = 0;
        
        for (int roll_time = 1; roll_time<=1000; roll_time++) {
            int die1_chal, die2_chal;
            
            while (true){
                die1_chal = (int)(Math.random()*6)+ 1;
                die2_chal = (int)(Math.random()*6)+ 1;
                
                if (die1_chal == 1 && die2_chal== 1) {
                    break;
                }
                chal_count++; 
            }
        }  
        System.out.println("Average number of rolls taken to get the snake eye 1000 times: " + chal_count/1000);

    }
    
}
