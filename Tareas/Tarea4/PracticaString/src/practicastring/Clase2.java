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
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
  public int Resul(int num){
    int resultado=0;
    resultado=num%10;
    if(resultado==2||resultado==5||resultado==8){
    return num*num;
    }else if(resultado==4||resultado==7||resultado==9){
    return num*5;
    }
    return num;
}
}