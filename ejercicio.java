
package parcial;

import java.util.Scanner;

public class ejercicio {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];

        // Ingresar 10 elementos en el vector
        System.out.println("Ingrese 10 elementos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Mostrar los elementos del vector
        System.out.println("Los elementos del vector son:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }  
    }  
}

