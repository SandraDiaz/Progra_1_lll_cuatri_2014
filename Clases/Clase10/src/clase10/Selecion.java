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
public class Selecion {

    public int[] OrdenSelecion (int arreglo[], String ordenamiento)  {
        int indice = 0;
        int indice2 = 0;
        int menor = 0;
        int pocision = 0;
        int temporal = 0;
        for (indice = 0; indice < arreglo.length - 1; indice++) {
            menor = arreglo[indice];
            pocision = indice;
            for (indice2 = indice + 1; indice2 < arreglo.length; indice2++) {
                if (arreglo[indice2] < menor) {
                    menor = arreglo[indice2];
                    pocision = indice2;
                }
            }
            if (pocision != indice) {
                temporal = arreglo[indice];
                arreglo[indice] = arreglo[pocision];
                arreglo[pocision] = temporal;
            }
        }
        return arreglo;
    }
            }
