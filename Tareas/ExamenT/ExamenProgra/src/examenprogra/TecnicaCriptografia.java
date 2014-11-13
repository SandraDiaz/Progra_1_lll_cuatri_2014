/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprogra;

/**
 *
 * @author usuario
 */
public class TecnicaCriptografia {
//Una de las técnicas de criptografía consiste en sustituir
//    cada uno de los caracteres por otro situado n posiciones más a la derecha. 
//    Si n = 2, por ejemplo, sustituiremos la a por la c, la b por la e, y así sucesivamente.
//    El problema que aparece en las ultimas n letras del alfabeto tiene fácil solución:
//    en el ejemplo, la letra y se sustituirá por la a y la letra z por la b. 
//    La sustitución debe aplicarse a las letras minúsculas y mayúsculas y a los dígitos
//    (el 0 se sustituye por el 2, el 1 por el 3 y así hasta llegar al 9, que se sustituye por el 1). 
//    Diseñe un programa que lea un texto y el valor de n  y muestre su versión criptográfica.   

    String abc = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";
    String Palabra = " ";
    int salto = 0;
//    int[] numv = {1,2,3,4,5,6,7,8,9,0};
//guardo los valores
    public void setSalto(int salto) {
        this.salto = salto;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }
//recorre e abecedario
    public String abecedario() {
        String r = "";
        char letra = ' ', letra2 = ' ', letraSalto = ' ';
        for (int j = 0; j < Palabra.length(); j++) {
            letra = Palabra.charAt(j);
            for (int i = 0; i < abc.length(); i++) {
                letra2 = abc.charAt(i);
                for (int x = 0; x < num.length(); x++) {

                }
                //si l letra que va recorriendo el program es igual se guarda para imprimirla
                if (letra == letra2) {
                    int comp = (int) letra;
                    for (int k = 0; k <= salto; k++) {
                        letraSalto = (char) (letra + k);
                    }
                    r += letraSalto;
                }

            }
        }
        return r;
    }

}
