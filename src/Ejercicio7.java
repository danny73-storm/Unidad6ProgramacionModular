package src;

import java.util.Random;


public class Ejercicio7 {

    public static void main(String[] args) {
        Random rnd = new Random();
	int matriz[][],nfilas=4,ncolumnas=3;
        int sumarfilas;
        
        matriz = new int [nfilas][ncolumnas];	
        
        //La matriz se lleno de numeros aleatorios.
	for (int i = 0; i < nfilas; i++) {
            sumarfilas =0;
            for (int j = 0; j < ncolumnas; j++) {
                int numeroAleatorio = (int) (Math.random()*555+1);
                matriz[i][j]= numeroAleatorio;
                if ((i+1)% 2 ==0) {
                 sumarfilas += matriz[i][j];
                }    
            } 
            System.out.println("---------------------------------------");
            System.out.println("Las suma de las filas "+(i+1)+" es: " +sumarfilas);
        }
        
        //imprimimos en consola la matriz obtenida
        System.out.println("\n***************************************************");
	System.out.println("La matriz es de 4X3 con elementos entre 0 y 555 es: ");
        for (int i = 0; i < nfilas; i++) { //--> numero de filas.
            for (int j = 0; j < ncolumnas; j++) { //--> numero de columnas.
                System.out.print(matriz[i][j]+ " ");     
            }System.out.println("");
        }
    }    
}
