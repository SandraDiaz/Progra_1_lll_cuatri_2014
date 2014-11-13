/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase10;

/**
 *
 * @author Monse
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Selecion selecion=new Selecion();
int[]arreglito={8,5,2,6,0};
int [] temporal =selecion.OrdenSelecion(arreglito, "B");
        for (int i = 0; i < temporal.length; i++) {
            System.out.println(temporal [i]);
        }
        System.out.println();
        
        Burbuja oBurbuja=new Burbuja();
        oBurbuja.OrdenBurbuja(arreglito, "B");
    }
    
}
