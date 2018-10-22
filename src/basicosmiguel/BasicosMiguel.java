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
    
         /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }

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
        
        numericos();  // Llamada al método
    }
    
}
