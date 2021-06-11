package  src;

public class Ejercicio5 {

    
    public static void main(String[] args) {
        int cantidadEstudiante = (int)Math.floor(Math.random()*100+1);
        int[] array = new int[cantidadEstudiante];
        int promedio =0, suma = 0;  
  
        for ( int i= 1; i<cantidadEstudiante; i++){
            int ElementoAleatorio = (int) Math.floor(Math.random()*10+1);
            array[i]= ElementoAleatorio;
        }
        System.out.println("================================================");
        System.out.println("Los valores de los indices de los arreglos son: ");
        for (int i= 1; i<cantidadEstudiante; i++){
            System.out.print(array[i]+ ", "+" -50");
        }
        System.out.println("");
        for (int i = 1; i < cantidadEstudiante; i++) {
            suma+=array[i];
            promedio = (suma)/i;
        }
            System.out.println("");
            System.out.println("************************************************");
            System.out.println("El valor promedio de las notas es "+ promedio); 
    }
    
}
