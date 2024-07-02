/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;
public class Numerito {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        
        int numero, numeroInt,intentos;
        
        numero =(int)Math.round((Math.random()*99)+1);
        intentos = 1;
        System.out.println("Adivina el numero seleccionado por el programa en menos de 10 intentos");
        do{
            System.out.printf("INTENTO NUMERO %d DE 10\n",intentos);
            System.out.println("Ingrese numero: ");
            numeroInt = leer.nextInt();
            if(intentos > 9){
                System.out.println("PERDISTE NO ENCONSTRASTE EL NUMERO "+ numero);
                break;
            }
            if(numeroInt == numero){
                System.out.println("Lo lograste XD encontras el numero "+ numero);
                break;
            }else{
                if(numero < numeroInt){
                    System.out.println("numero ingresado es mayor que el numero a buscar");
                }else{
                    System.out.println("numero ingresado es menor que el numero a buscar");
                }
            }
            intentos++;
        }while(numeroInt != numero);
        System.out.println("programador: MEVA");
    }
}
