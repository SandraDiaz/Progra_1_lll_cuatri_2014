/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;
import java.util.Scanner;
/**
 *
 * @author Monse
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion qiue decea:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Salir");
            opcion = oScanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1 oEjercicio1= new Ejercicio1();
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.printIn("Digite el salario del trabajador # " +(i+1));
                        oEjercicio1.AgregarSalario(teclado.nextDouble());
                    }System.out.printIn(oEjercicio1.ImprimirSueldos());
                    break;
                    
    }
    
}
