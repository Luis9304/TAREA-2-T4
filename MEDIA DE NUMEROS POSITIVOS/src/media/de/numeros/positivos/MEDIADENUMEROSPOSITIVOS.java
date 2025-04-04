/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media.de.numeros.positivos;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class MEDIADENUMEROSPOSITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        while (true) {
            System.out.print("Ingresa un número positivo (o un número negativo para terminar): ");
            int numero = scanner.nextInt();
             if (numero >= 0){
            } else {
                 break;
            }
            suma += numero;
            contador++;
        }
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
             
        
    }
    
}
    

