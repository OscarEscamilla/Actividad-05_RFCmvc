/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelRFC;
import views.ViewRFC;
import extras.DataValidation;

/**
 *
 * @author oscar
 */
public class ControllerRFC {
    ModelRFC modelrfc;
    ViewRFC viewrfc;
    DataValidation validar = new DataValidation();

    public ControllerRFC(ModelRFC modelRFC, ViewRFC viewRFC) {
        this.modelrfc = modelRFC;
        this.viewrfc = viewRFC;
        this.viewrfc.jb_cacular.addActionListener(actionListener);
        this.viewrfc.jb_limpiar.addActionListener(actionListener);
        initComponents();
       
    }
    
    ActionListener actionListener = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==viewrfc.jb_cacular){
                calcularRFC();   
            }else if(e.getSource() == viewrfc.jb_limpiar){
                limpiarCajas();
            }
        }
        
    };

    public ControllerRFC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void calcularRFC(){
        //envia todos los datos obtenidos de la vista a el modelo
        modelrfc.setNombre(viewrfc.jtf_nombre.getText().toUpperCase());
        modelrfc.setAp_paterno(viewrfc.jtf_paterno.getText().toUpperCase());
        modelrfc.setAp_materno(viewrfc.jtf_materno.getText().toUpperCase());
        modelrfc.setDia(String.valueOf(viewrfc.js_dia.getValue()));
        modelrfc.setAnio(String.valueOf(viewrfc.jtf_anio.getText()));
        
        if(modelrfc.getDia().length() <= 1){//si la cifra del dia tiene solo un digito agrega un 0 a la izquierda
            modelrfc.setDia("0"+String.valueOf(viewrfc.js_dia.getValue()));
        }
        
        switch(viewrfc.jcb_mes.getSelectedIndex()){//evalua el mes seleccinado y asiga el valor 
            case 0:
                modelrfc.setMes("01");
            break;
            case 1:
                modelrfc.setMes("02");
            break;
            case 2:
                modelrfc.setMes("03");
            break;
            case 3:
                modelrfc.setMes("04");
            break;
            case 4:
                modelrfc.setMes("05");
            break;
            case 5:
                modelrfc.setMes("06");
            break;
            case 6:
                modelrfc.setMes("07");
            break;
            case 7:
                modelrfc.setMes("08");
            break;
            case 8:
                modelrfc.setMes("09");
            break;
            case 9:
                modelrfc.setMes("10");
            break;
            case 10:
                modelrfc.setMes("11");
            break;
            case 11:
                modelrfc.setMes("12");
            break;
        }
            

        
        
        
        String RFC = modelrfc.getAp_paterno()+ modelrfc.getAp_materno() + modelrfc.getNombre() + modelrfc.getAnio() + modelrfc.getMes() + modelrfc.getDia();
        
        viewrfc.jtf_rfc.setText(RFC);
    }
    
    public void limpiarCajas(){
        viewrfc.jtf_materno.setText("");
        viewrfc.jtf_paterno.setText("");
        viewrfc.jtf_nombre.setText("");
        viewrfc.jtf_anio.setText("");
        viewrfc.jtf_rfc.setText("");
        viewrfc.jcb_mes.setSelectedIndex(0);
        viewrfc.js_dia.setValue(1);
    }
    
    public final void initComponents(){
        viewrfc.setVisible(true);
        viewrfc.js_dia.setValue(1);
        
    } 
}
