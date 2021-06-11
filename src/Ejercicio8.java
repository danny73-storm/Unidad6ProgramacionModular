package src;

import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String[] array1 = new String[5];
        String[] array2 = new String[5];
       
        System.out.println("\nIgrese los elementos del arreglo1");
        System.out.println("-----------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite una palabra");
            array1[i]= leer.nextLine();
        }
         System.out.println("\nIgrese los elementos del arreglo2");
         System.out.println("-----------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite una palabra");
            array2[i]= leer.nextLine();
        }
        System.out.println("\n**********************************");
        System.out.println("EL Primer arreglo es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println("\n**********************************");
        System.out.println("EL Segundo arreglo es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println("************************************");
    }
    
}