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
public class Clase1 {

    String Enero, Febrero, Marzo, abril, Mayo, Junio, Julio, agosto, Septiembre, Octubre, Noviembre, Diciembre;
    int num;

    public Clase1() {
        this.num = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String Mes(int num) {
        String Mes = " ";
        if (num == 1) {
            Mes = Enero;
        } else if (num == 2) {
            Mes = Febrero;
        } else if (num == 3) {
            Mes = Marzo;
        } else if (num == 4) {
            Mes = abril;
        } else if (num == 5) {
            Mes = Mayo;
        } else if (num == 6) {
            Mes = Junio;
        } else if (num == 7) {
            Mes = Julio;
        } else if (num == 8) {
            Mes = agosto;
        } else if (num == 9) {
            Mes = Septiembre;
        } else if (num == 10) {
            Mes = Octubre;
        } else if (num == 11) {
            Mes = Noviembre;
        } else if (num == 12) {
            Mes = Diciembre;
        }return Mes;
    }
}
