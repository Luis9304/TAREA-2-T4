/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.basica.de.menu;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CALCULADORABASICADEMENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
         boolean continuar = true;  
         while (continuar) {
            System.out.println("----- Calculadora Básica -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Elige una opción (1-4): ");
            int opcion = scanner.nextInt();
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado = 0;
            switch (opcion) {
                case 1: 
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
            System.out.print("¿Deseas realizar otra operación? (sí/no): ");
            String respuesta = scanner.next();
            
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false; 
             }
        }
        System.out.println("¡Gracias por usar la calculadora!");
                          

        }
    }
    

