/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenprogra;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ExamenProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion qiue decea:");
            System.out.println("1. Tecnicas de Criptografia");
            System.out.println("2. Desglose de billetes");
            System.out.println("3.Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    TecnicaCriptografia oTecnicaCriptografia = new TecnicaCriptografia();
                    System.out.println("Digite la Palabra ");
                    String p=teclado.next();
                    System.out.println();
                    System.out.println("Digite el numero de Saltos a evaluar");
                    int s=teclado.nextInt();
                    break;
                case 2:
                    Billetes oBilletes=new Billetes();
                    System.out.println("Digite el monto");
                    int m=teclado.nextInt();
                    oBilletes.monedas2();
                    oBilletes.Billetes();
            }

        } while (opcion < 2);
    }
}
