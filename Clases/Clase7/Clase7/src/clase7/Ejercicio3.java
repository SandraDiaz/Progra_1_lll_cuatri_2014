/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Monse
 */
public class Ejercicio3 {

    private double salarioManana[] = new double[4];
    private double salarioTarde[] = new double[4];

    public void agregarSalarioManana(double sueldo) {
        for (int i = 0; i < salarioManana.length; i++) {
            if (salarioManana[i] == 0) {
                salarioManana[i] = sueldo;
                break;
            }
        }
    }
    
    public void agregarSalarioTarde(double sueldo){
        for (int i = 0; i < salarioTarde.length; i++) {
            if(salarioTarde[i]==0){
            salarioTarde[i]= sueldo;
            break;
            }
        }
    }
    
    public String ImprimirGastos(){
    double sumaSalarioManana=0;
    double sumaSalarioTarde=0;
    
        for (int i = 0; i < salarioManana.length; i++) {
            sumaSalarioManana+=salarioManana[i];
        }
        for (int i = 0; i < salarioTarde.length; i++) {
            sumaSalarioTarde+=salarioTarde[i];
        }
        return"El salario en el turno de la Mañana es"+sumaSalarioManana+"\n"+
        "El salario en el turno de la Tarde es"+sumaSalarioTarde;
    }
}
