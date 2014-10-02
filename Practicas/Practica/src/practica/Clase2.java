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
  suma=this.X+this.Y;
  return suma;
    }
   public double suma(double N,double M){
   double suma;
   suma= this.M+this.N;
   return suma;
   }
   public int resta(int Y, int X){
       int resta;
       resta=this.X-this.Y;
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
   multiplicacion=this.X*this.Y;
   return multiplicacion;
   }
   public double multiplicacion(double N,double M){
   double multiplicacion;
   multiplicacion= this.N*this.M;
   return multiplicacion;
   }
    public int divicion(int Y, int X){
    int divicion;
    divicion=this.X/this.Y;
    return divicion;
    }
    public double divicion(double N, double M){
   double divicion;
   divicion=this.M/this.N;
   return divicion;
    }
}
