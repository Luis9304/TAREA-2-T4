/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinar.un.numero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class ADIVINARUNNUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int suposicion = 0;
        int intentos = 0;
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Intenta adivinarlo!");
        while (suposicion != numeroSecreto) {
            System.out.print("Ingresa tu suposición: ");
            suposicion = scanner.nextInt();
            intentos++;
            if (suposicion < numeroSecreto) {
                System.out.println("¡Demasiado bajo! Intenta nuevamente.");
            } else if (suposicion > numeroSecreto) {
                System.out.println("¡Demasiado alto! Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
             }
        }    
            }    
        }
        
    
    

