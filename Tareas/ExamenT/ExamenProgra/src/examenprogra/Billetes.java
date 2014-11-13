/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenprogra;

/**
 *
 * @author Monse
 */
public class Billetes {
        int monedas[] = {5000,2000,1000,5000,500, 100, 50, 25}; //inicialización implícita del arreglo
        int cambio[] = new int[8];
        int num;
        //este es el desglose
        public int monedas2(){
        for(int i = 0; i<= 7; i++) {
            cambio[i] = 0;
            // división entera entre n y el valor de monedas[i]
            cambio [i] =  num / monedas[i];
            num = num - (cambio[i] * monedas[i]);
        } return num;
        
        }
        public String Billetes(){
            String imprimir= " ";
        //este muestra el resultado del desglose
        for (int i=0; i <= 7; i ++) {
            if (cambio[i] != 0) {
                if(monedas[i] <= 500){
                    imprimir="Monedas de " + monedas[i];
                    System.out.print(cambio[i]);
                }else{
                    imprimir="Billetes de " + monedas[i];
                    System.out.print(cambio[i]);
                }
            }
        }
       return imprimir; }

}
