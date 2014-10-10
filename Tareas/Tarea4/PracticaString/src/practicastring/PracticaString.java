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

        boolean validar = true;
        int valor1 = 0;
        int valor2 = 0;
        double resultado;
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
                    System.out.println("Digite el Mes");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sumar(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 2:
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo dígito ");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Resta(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo dígito ");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Division(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 4:
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo dígito ");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Multiplicacion(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 5:
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Raiz(valor1);
                    System.out.println(resultado);
                    break;

                case 6:
                    System.out.println("Digite el valor del primer dígito ");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo dígito ");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    oOperaciones.Potencia(valor1, valor2);
                    resultado = oOperaciones.Potencia(valor1, valor2);
                    System.out.println(resultado);
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
