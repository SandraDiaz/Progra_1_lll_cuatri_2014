/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;

/**
 *
 * @author Monse
 */
public class Lineal {
    public int BusquedaLineal(int[]arreglo,int elemento){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==elemento){
            return i;
            }
        }
        return -1;
    }
}
