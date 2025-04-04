/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteo.de.numeros;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONTEODENUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números desea ingresar? ");
        int cantidad = scanner.nextInt();
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número #" + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }
        System.out.println("\nResumen:");
        System.out.println("Números mayores que 0: " + mayoresQueCero);
        System.out.println("Números menores que 0: " + menoresQueCero);
        System.out.println("Números iguales a 0: " + igualesACero);
    }
        
    
    
}
