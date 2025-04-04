/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.de.un.nuemro;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class FACTORIALDEUNNUEMRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
          System.out.print("Introduce un número para calcular su factorial: ");
          int numero = scanner.nextInt();
          if (numero < 0) {
              System.out.println("El factorial no está definido para números negativos.");
          } else {
              long factorial = 1;
              for (int i = 1; i <= numero; i++) {
                  factorial *= i;
              }
              System.out.println("El factorial de " + numero + " es: " + factorial);
          }
              }
          }
         
    
    

