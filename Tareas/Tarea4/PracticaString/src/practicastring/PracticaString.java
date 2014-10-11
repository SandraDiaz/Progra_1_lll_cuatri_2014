/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastring;

import java.util.Scanner;

/**
 *
 * @author Monse
 */
public class PracticaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        char continuar;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("Digite la operación a evaluar ");
            System.out.println("1. Mes ");
            System.out.println("2. Tipo de numero ");
            System.out.println("3. Tipo de letra ");
            System.out.println("4. Numero de dias que tiene el mes  ");
            System.out.println("5. Equivalencia en numeros Romanos  ");
            System.out.println("6. Fecha anterior  ");
            System.out.println("7.Semana qe corresponde ");
            System.out.println("8.Dia de la semana actual ");
            
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    Clase1 oClase1= new Clase1();
                    System.out.println("Digite el Mes");
                    teclado = new Scanner(System.in);
                    int num= Integer.parseInt(teclado.nextLine());
                    String  Mes = oClase1.Mes(num);
                    System.out.println(Mes);
                    break;

                case 2:
                    Clase2 oClase2=new Clase2();
                    System.out.println("Digite el numero ");
                    teclado = new Scanner(System.in);
                    int nume = Integer.parseInt(teclado.nextLine());
                    int result = oClase2.Resul(nume);
                    System.out.println(result);
                    break;

                case 3:
                    Clase3 oClase3= new Clase3();
                    System.out.println("Digite la letra ");
                    teclado = new Scanner(System.in);
                    char letra = Integer.parseInt(teclado.nextLine());
                    String Mensaje = oClase3.Mensaje(letra);
                    System.out.println(Mensaje);
                    break;

                case 4:
                    Clase4 oClase4=new Clase4();
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    Mesa = Integer.parseInt(teclado.nextLine());
                    dias = oClase4.fecha(int anno, int mesa);
                    System.out.println(dias);
                    break;

                default:

                    break;
            }
            System.out.println("Desea continuar con otra operación S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }
        } while (validar);

    }

}
