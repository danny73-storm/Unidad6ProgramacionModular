package src;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] array = new int[10];
        
        int i;
        int numeBuscar;
        int verda;
        boolean  decicion = true;
        
        for ( i= 0; i<8; i++){
            int ElementoAleatorio = (int) Math.floor(Math.random()*100);
            array[i]= ElementoAleatorio;  
        }
        System.out.println("Ingrese el valor a buscar");
        numeBuscar = leer.nextInt();
    
        System.out.println("================================================");
        System.out.println("Los valores de los indices de los arreglos son: ");
        for (i= 0; i<8; i++){
            System.out.print(array[i]+ ", ");
        }
        System.out.println("");
        if (numeBuscar == array[i]) {
            verda = numeBuscar;  
            System.out.println("================================================");
            System.out.println("El numero "+numeBuscar+" se encotro? :  verdadero");
        }else{
            System.out.println("El numero "+numeBuscar+" se encuetra entre los elemetos del arreglo? :  falso");      
        }    
    }
}