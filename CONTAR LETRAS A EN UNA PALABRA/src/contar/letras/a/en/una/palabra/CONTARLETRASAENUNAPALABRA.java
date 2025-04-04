/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contar.letras.a.en.una.palabra;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONTARLETRASAENUNAPALABRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        int contador = 0;
         palabra = palabra.toLowerCase();
         for (int i = 0; i < palabra.length(); i++) {
             if (palabra.charAt(i) == 'a') {
                 contador++;
             }    
         }    
         System.out.println("La letra 'a' aparece " + contador + " veces en la palabra.");
         
        
    }
    
}
