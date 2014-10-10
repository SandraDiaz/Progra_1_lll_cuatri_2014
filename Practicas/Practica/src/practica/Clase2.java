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
public class Clase2 {
    //VARIABLES
    int Y, X;
    double N, M;
    
    public Clase2(){
    this.M=0;
    this.N=0;
    this.X=0;
    this.Y=0;
    }
    public int suma(int Y, int X)
    {
  int suma;
  suma=this.Y+this.X;
  return suma;
    }
   public double suma(double N,double M){
   double suma;
   suma= this.N+this.M;
   return suma;
   }
   public int resta(int Y, int X){
       int resta;
       resta=this.Y-this.X;
       return resta;
   }
   public double resta(double M, double N)
   {
   double resta;
   resta=this.M-this.N;
   return resta;
   }
   public int multiplicacion(int Y, int X){
   int multiplicacion;
   multiplicacion=this.Y*this.X;
   return multiplicacion;
   }
   public double multiplicacion(double N,double M){
   double multiplicacion;
   multiplicacion= this.N*this.M;
   return multiplicacion;
   }
    public int divicion(int Y, int X){
    int divicion;
    divicion=this.Y/this.X;
    return divicion;
    }
    public double divicion(double N, double M){
   double divicion;
   divicion=this.N/this.M;
   return divicion;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public double getN() {
        return N;
    }

    public void setN(double N) {
        this.N = N;
    }

    public double getM() {
        return M;
    }

    public void setM(double M) {
        this.M = M;
    }
    
}
