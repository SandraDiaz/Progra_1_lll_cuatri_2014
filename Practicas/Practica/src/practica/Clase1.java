/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Monse
 */
public class Clase1 {

    int N;
    double A;
    char C;

    public Clase1() {
        this.A = 1;
        this.C = 1;
        this.N = 1;
    }

    public double sumarotiadenNyA(int N, double A) {
        double suma;
        suma = this.N + this.A;
        return suma;
    }

    public double diferenciaAyN(int N, double A) {
        double diferencia;
        diferencia = this.N - this.A;
        return diferencia;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public char getC() {
        return C;
    }

    public void setC(char C) {
        this.C = C;
    }

}
