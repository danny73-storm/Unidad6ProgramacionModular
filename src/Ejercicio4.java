package src;

public class Ejercicio4 {

    
    public static void main(String[] args) {
       int[] array = new int[10];
 
        int mayor =0;
  
        for ( int i= 0; i<10; i++){
            int ElementoAleatorio = (int) Math.floor(Math.random()*100);
            array[i]= ElementoAleatorio;
            if (array[i]>mayor) {
            mayor = array[i];     
            }  
        }
        System.out.println("================================================");
        System.out.println("Los valores de los indices de los arreglos son: ");
        for (int i= 0; i<10; i++){
            System.out.print(array[i]+ ", ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            int diferencia = mayor-array[i];
            System.out.println("");
            System.out.println("************************************************");
            System.out.println("Entre " + mayor+" y "+array[i]+" los numeros de distancia son: "+diferencia ); 
        }
    } 
}
