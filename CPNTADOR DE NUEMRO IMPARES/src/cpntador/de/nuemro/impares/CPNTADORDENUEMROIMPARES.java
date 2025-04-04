/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpntador.de.nuemro.impares;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CPNTADORDENUEMROIMPARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            int i = 1; 
            do {
               System.out.println(i);
                i += 2;
            } while (i <= numero);
        } else {
            System.out.println("El número ingresado no es válido. Debe ser un número positivo.");
        }   
            }
        
        
    }
    

