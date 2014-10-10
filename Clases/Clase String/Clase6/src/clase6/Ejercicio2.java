/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Monse
 */
/* 1.Imprimir la primera mitad de los caracteres de cadena
 2.Imprimir el ultimo caracter
 3.Imprimir en forma inversa
 4.Imprimir cada caracter del string separado en un guion
 5.Imprimir la cantidad de vocales almacenadas
 6.Implementar un metodo que verifique si la cadena se lee de izquierda a derecha tanto como de derecha a izquierda (se lee igual en las 2 direcciones)

 */
public class Ejercicio2 {

    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String UltimoValor() {
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public String Alrevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String Guion() {
        String retorno = "";
        for (int i = 0; i < getCadena().length(); i++) {
            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;
    }

    public int Vocales() 
    {
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {
            if ((getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'a')
                    || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'e')
                    || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'i')
                    || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'o')
                    || (getCadena().charAt(i) == 'U')
                    || (getCadena().charAt(i) == 'u')) { cantidadVocales++;
                
            }
        }return cantidadVocales;
    }
    public boolean Palindromo(){
    String palabraAlrevez="";
        for (int i = getCadena().length()-1; i>=0; i--) {
            palabraAlrevez+=+getCadena().charAt(i);
        }
        if(getCadena().equals(palabraAlrevez)){
        return true;
        }
        else{
        return false;
        }
    }
}
