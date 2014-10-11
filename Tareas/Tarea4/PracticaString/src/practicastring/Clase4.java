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
public class Clase4 {

    int mesa, anno;

    public Clase4() {
        this.anno = 0;
        this.mesa = 0;
    }

    public int getMes() {
        return mesa;
    }

    public void setMeas(int mesa) {
        this.mesa = mesa;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int fecha(int anno, int mesa) {

        int dias = 0;
        if (mesa == 1 || mesa == 3 || mesa == 5 || mesa== 7 || mesa == 8 || mesa == 10 || mesa == 12) {
            dias = 31;
        } else if (mesa == 4 || mesa == 6 || mesa == 9 || mesa == 11) {
            dias = 30;
        } else if (mesa == 2) {
            dias = 28;
        }
        return dias;
    }
}
