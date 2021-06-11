package src;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); //Creación de un objeto Scanner
        
        //creando arreglo
        int[] array = new int[5];
           
        System.out.println ("Digite los elementos del arreglo");
        
        //utilizando ciclos for para el arreglo.
        for ( int i= 0; i<5; i++){
               
            array[i]= leer.nextInt();
            System.out.println ("El Indice ["+ i +"]="+ " esta el valor "+array[i]);
        }
        for ( int i= 0; i<5; i++){
            System.out.print("");
            System.out.print(array[i]+ ", ");
        }
    }    
}