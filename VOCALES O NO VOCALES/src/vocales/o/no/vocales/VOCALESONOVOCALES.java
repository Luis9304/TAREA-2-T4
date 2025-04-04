/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocales.o.no.vocales;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class VOCALESONOVOCALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingresa una letra (o un espacio para terminar): ");
            String entrada = scanner.nextLine();
             if (entrada.equals(" ")) {
                 break;
             }
              if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char letra = entrada.toLowerCase().charAt(0);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("La letra '" + entrada + "' es una vocal.");
                } else {
                    System.out.println("La letra '" + entrada + "' es una consonante.");
                }
            } else {
                   System.out.println("Por favor, ingresa una letra válida.");
         System.out.println("Programa terminado.");
         
                }
             }
        }
        
    }
    

