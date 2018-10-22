/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosmiguel;

/**
 *
 * @author playvicio
 */
import java.util.Scanner;
public class BasicosMiguel {

    public static void logicos(){
        boolean puedeBeber;
        Scanner scanner = new Scanner(System.in);
	System.out.print("Dime tú edad:");
	int edad = scanner.nextInt();
        puedeBeber = (edad>=18)&&(edad<=60);
        if(puedeBeber){
            System.out.println("Si puede beber");
        }else{
            System.out.println("No puede beber");
        }
        
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        logicos();
        
    }
    
}
