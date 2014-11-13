/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author Monse
 */
public class Ejercicio1 {

    int[] valor = new int[8];

    public int AcomuladoValor() {
        int suma = 0;
        for (int i = 0; i < valor.length; i++) {
            suma += valor[i];
        }
        return suma;
    }

    public int AcomuladoMayor36() {
        int suma = 0;
        for (int i = 0; i > 36; i++) {
            suma += valor[i];
        }
        return suma;
    }

    public int AcomuladoMayor50() {
        int num = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > 50) {
                num++;
            }
        }
        return num;
    }
    }
