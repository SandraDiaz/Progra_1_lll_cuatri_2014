/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;
import java.util.Scanner;
/**
 *
 * @author Monse
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int opcion = 0;
        Scanner teclado= new Scanner(System.in);
        do {
            System.out.println("Digite la opcion qiue decea:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Ejercicio 4");
            System.out.println("5.Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 oEjercicio1= new Ejercicio1();
                    teclado= new Scanner(System.in);
                    System.out.println("Digite los Valores");
                    oEjercicio1.AcomuladoValor(teclado.next);
                    break;
            }
            while (opcion < 1);
        }
        }
}
