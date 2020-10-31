package examen2;
import java.util.*;

public class Examen2 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);    
        
    int numeros [] = new int[10];
    int par = 0, impar = 0;
    
        System.out.println("Es hora de llenar el arreglo ");
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"Introduzca un número");    
            numeros[i] = leer.nextInt();
            
            if (numeros[i]%2==0) {
                par++;
            } else {
                impar++;
            }
        }
        
        int pares [] = new int[par];
        int impares [] = new int[impar];
        
        par = 0;
        impar = 0;
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i]%2==0) {
                pares[par] = numeros[i];
                par++;
            } else {
                impares[impar] = numeros[i];
                impar++;
            }
           
        }
        System.out.println("\nPares");
        for (int i = 0; i < par; i++) {
            System.out.println((pares[i])+",");
        }
        System.out.println("---------------------");
        System.out.println("\nImpares");
        for (int i = 0; i < impar; i++) {
            System.out.println((impares[i])+",");
        }
    }
}
