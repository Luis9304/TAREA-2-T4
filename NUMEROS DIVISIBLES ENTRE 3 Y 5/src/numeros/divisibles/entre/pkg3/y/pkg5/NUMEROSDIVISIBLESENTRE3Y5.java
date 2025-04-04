/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.divisibles.entre.pkg3.y.pkg5;

/**
 *
 * @author luis_
 */
public class NUMEROSDIVISIBLESENTRE3Y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1; i<=100; i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
             }else if(i%5 == 0){
                 System.out.println("Buzz");
             }else{
                 System.out.println(i);
             }   
                 
           
            }
        }
                
    }
    

