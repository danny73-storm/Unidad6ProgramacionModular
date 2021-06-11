package src;

public class Ejercicio6 {

    
    public static void main(String[] args) {
       //Primer corchete --> primer array ó arrglo .
       //corchetes de dentro --> numero de filas.
       //Elermentos dentro de los corche dentro --> cantidad de columnas.
       int arrays1[][] = {{5 , 6 , 13},{14 , 2 ,4},{21 , 7 ,6}};
       int arrays2[][] = {{5*2,6*2 ,13*2},{14*2,2*2,4*2},{21*2,7*2,6*2}};
       
        for (int i = 0; i < 3; i++) { //--> numero de filas.
            for (int j = 0; j < 3; j++) { //--> numero de columnas.
                System.out.print(arrays1[i][j]+ " ");     
            }System.out.println("");
        }
        System.out.println("Los dobles de los elemntos de la matriz anterior son: ");
        for (int i = 0; i < 3; i++) { //--> numero de filas.
            for (int j = 0; j < 3; j++) { //--> numero de columnas.
                System.out.print(arrays2[i][j]+ " ");     
            }System.out.println("");
        } 
    } 
}