/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia.aritmetica;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class SECUENCIAARITMETICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();
        System.out.print("Ingrese la diferencia entre los números: ");
        int diferencia = scanner.nextInt();
        System.out.print("Ingrese el número máximo de la secuencia: ");
        int numeroMaximo = scanner.nextInt();
        if (numeroMaximo >= primerNumero) {
            int numeroActual = primerNumero;
            do {
                System.out.println(numeroActual);
                numeroActual += diferencia; 
            } while (numeroActual <= numeroMaximo);
        } else 
            System.out.println("El número máximo debe ser mayor o igual al primer número.");
        }
            
            
    }
    

