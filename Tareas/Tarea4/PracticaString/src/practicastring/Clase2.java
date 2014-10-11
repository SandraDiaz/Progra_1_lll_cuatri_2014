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
public class Clase2 {
    int nume;

    public int getNume() {
        return nume;
    }

    public void setNum(int nume) {
        this.nume = nume;
    }
  public int Resul(int nume){
    int resultado=0;
    resultado=nume%10;
    if(resultado==2||resultado==5||resultado==8){
    return nume*nume;
    }else if(resultado==4||resultado==7||resultado==9){
    return nume*5;
    }
    return nume;
}
}