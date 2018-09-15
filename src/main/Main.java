/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelRFC;
import views.ViewRFC;
import controllers.ControllerRFC;
/**
 *
 * @author oscar
 */
public class Main {
     private static ModelRFC modelrfc;
     private static ControllerRFC controllerrfc;
     private static ViewRFC viewrfc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        modelrfc = new ModelRFC();
        viewrfc= new ViewRFC();
        controllerrfc = new ControllerRFC(modelrfc,  viewrfc);
    }
    
}
