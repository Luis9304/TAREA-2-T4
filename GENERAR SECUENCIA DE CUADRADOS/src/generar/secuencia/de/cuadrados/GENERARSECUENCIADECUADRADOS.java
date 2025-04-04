/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generar.secuencia.de.cuadrados;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class GENERARSECUENCIADECUADRADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el limite de la secuencia: ");
        int numero = scanner.nextInt();
         if (numero > 0) {
            int i = 1;
            do {
                int cuadrado = i * i;
                System.out.println("El cuadrado de " + i + " es: " + cuadrado);
                i++;
                } while (i <= numero); 
        
            }
                

                  
           
        }
        
    }
    

