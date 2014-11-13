/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastring;

/**
 *
 * @author Monse
 */
public class Clase3 {

    char letra, a, b, c, d, e;

    public Clase3() {
        this.letra = 0;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String Mensaje(char letra) {
        String Mensaje = " ";
        if (letra == a) {
            Mensaje = "Excelente";
        } else if (letra == b) {
            Mensaje = "Bueno";
        } else if (letra == c) {
            Mensaje = "Regular";
        } else if (letra == d) {
            Mensaje = "Malo";
        } else if (letra == e) {
            Mensaje = "Pesimo";
        }
        return Mensaje;
    }
}
