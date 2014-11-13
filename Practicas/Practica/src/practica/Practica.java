/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Monse
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int B, c;
        double A;
        char C;
        int X, Y, A4, B4, C4, D4, A5;
        double n, m;
        int O;

        Clase1 a = new Clase1();
        Scanner teclado = new Scanner(System.in);
        System.out.println("******** Clase 1 ********");
        System.out.println("Digite el valor de N");
        N = Integer.parseInt(teclado.nextLine());
        a.setN(N);
        System.out.println("Digite el valor de A");
        A = Double.parseDouble(teclado.nextLine());
        a.setA(A);
        System.out.println("Digite una letra para darle el valor a C");
        C = teclado.nextLine().charAt(0);
        a.setC(C);

        System.out.print("El valor de N es:" + a.getN() + "  El valor de A es:" + a.getA() + "  El valor de C es:" + a.getC());
        System.out.println("  La suma de N + A es:" + a.sumarotiadenNyA(N, A));
        System.out.println("La diferencia de A - N es:" + a.diferenciaAyN(N, A));
        System.out.println("El valor numerico de C es:" + a.getC());
        System.out.println("********************************");

        Clase2 b = new Clase2();
        System.out.println("******** Clase2 ********");
        System.out.println("Digite el valor de X");
        X = Integer.parseInt(teclado.nextLine());
        b.setX(X);
        System.out.println("Digite el valor de Y");
        Y = Integer.parseInt(teclado.nextLine());
        b.setY(Y);
        System.out.println("Digite el valor de N");
        n = Double.parseDouble(teclado.nextLine());
        b.setN(n);
        System.out.println("Digite el valor de m");
        m = Double.parseDouble(teclado.nextLine());
        b.setM(m);
        System.out.println("La suma de X+Y es:" + b.suma(Y, X));
        System.out.println("La suma de N+M es:" + b.suma(n, m));
        System.out.println("La resta de X-Y es:" + b.resta(Y, X));
        System.out.println("La resta de N-M es:" + b.resta(m, n));
        System.out.println("La multiplicacion de  X*Y es:" + b.multiplicacion(Y, X));
        System.out.println("La multiplicacion de N*M es:" + b.multiplicacion(m, n));
        System.out.println("La divicion de X/Y es:" + b.divicion(Y, X));
        System.out.println("La division de N/M es:" + b.divicion(m, n));
        System.out.println("*********************");

        Clase3 d = new Clase3();
        System.out.println("******** Clase3 ********");
        System.out.println("Digite el valor de N");
        N = Integer.parseInt(teclado.nextLine());
        d.setN(N);
        System.out.println("La suma de N + 77-3*2 es:" + d.incrementar(N));
        System.out.println("*******************");

        Clase4 e = new Clase4();
        System.out.println("******** Clase 4 ********");
        System.out.println("Digite el valor de A");
        A4 = Integer.parseInt(teclado.nextLine());
        e.setA(A4);
        System.out.println("Digite el valor de B");
        B4 = Integer.parseInt(teclado.nextLine());
        e.setB(B4);
        System.out.println("Digite el valor de C");
        C4 = Integer.parseInt(teclado.nextLine());
        e.setC(C4);
        System.out.println("Digite el valor de D");
        D4 = Integer.parseInt(teclado.nextLine());
        e.setD(D4);
        System.out.println("El nuevo valor de A es:" + e.getD());
        System.out.println("El nuevo valor de B es:" + e.getC());
        System.out.println("El nuevo valor de C es:" + e.getA());
        System.out.println("El nuevo valor de D es:" + e.getB());
        System.out.println("***************************");

        Clase5 f = new Clase5();
        System.out.println("******** Clase 5 ********");
        System.out.println("Digite el valor");
        A5 = Integer.parseInt(teclado.nextLine());
        f.setA(A5);
        if (f.par() == true) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        Clase6 g = new Clase6();
        System.out.println("******** Clase6 ********");
        System.out.println("Digite el valor de B");
        B = Integer.parseInt(teclado.nextLine());
        if (g.positivo() == true) {
            System.out.println("El valor de B es Negativo");
        } else {
            System.out.println("El valor de B es Posi1tivo");
        }
        
        Clase7 x = new Clase7();
        System.out.println("******** Clase7 ********");
        System.out.println("Digite el valor de C");
        c = Integer.parseInt(teclado.nextLine());
       x.setC(c);
        if (x.positivo() == true) {
            System.out.println("El valor de C es Negativo");
        } else {
            System.out.println("El valor de C es Positivo");
        }

        if (x.par() == true) {
            System.out.println("C es par");
        } else {
            System.out.println("C es impar");
        }
        if (x.multiplode5() == true) {
            System.out.println("El valor de C es multiplo de 5");
        } else {
            System.out.println("El valor de C NO es multiplo de 5");
        }
        if (x.multiplode10() == true) {
            System.out.println("El valor de C es multiplo de 10");
        } else {
            System.out.println("El valor de C NO es multiplo de 10");
        }
        if (x.esmayorque0() == true) {
            System.out.println("El valor de C es Menor que 100");
        } else {
            System.out.println("El valor de C es Mayor que 100");
        }
    }
}
