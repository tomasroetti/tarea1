package com.programacion;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**6070
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer número ");
        num1=numero.nextInt();


        System.out.println("Ingrese el valor del segundo número ");
        num2=numero.nextInt();

        sumaelreal misuma = new sumaelreal();

        int num3 = misuma.sumador(num1,num2);
        
        
        System.out.println(num3);







    

        

        
       
    }
}
