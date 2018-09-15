/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class DataValidation {
    
    
   
    
    public String validarAnio(String valor){
        String resultado = null;
        try{
            if(valor.length() < 4){
                resultado = valor;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Año no valido!!!");
        }
         return resultado;
       
 
    }
    
    
    
}
