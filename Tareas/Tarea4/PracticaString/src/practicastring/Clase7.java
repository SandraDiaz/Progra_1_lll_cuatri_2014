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
public class Clase7 {
        int dia;
        public Clase7(){
        this.dia=0;
        }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
        public String diassem(int num){
            String dia=" ";
        if(dia%7){
        
        }
        
            case 0: System.out.println("Domingo");break;
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            default: System.out.println("Numero fuera de rango");break;
        }
    }
}
