/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monse
 */
public class Clase7 {
    int C;
    
    public Clase7(){
    this.C=0;
    }
    public boolean positivo()
    {
    if ( this.C >= 0)
    {
    return (true);
    }
    else
    {
    return(false);
    }
    }
     public boolean par()
    {
    if ( this.C % 2 == 0)
    {
    return (true);
    }
    else
    {
    return(false);
    }
    }
     public boolean multiplode5()
     {
     if(this.C%5==0){
     return(true);
     }
     else{
     return(false);
     }
     }
     public boolean multiplode10()
     {
     if(this.C%10==0){
     return(true);
     }
     else{
     return(false);
     }
     }
     public boolean esmayorque0(){
     if(this.C<=100){
     return(true);
     }
     else{
     return(false);
     }
     }
     
}
