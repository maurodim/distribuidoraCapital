/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizaciones;

import ObjetosBackUp.BackUp;
import ObjetosBackUp.Backapear;

/**
 *
 * @author mauro
 */
public class Cierre implements Runnable{
    Thread hilo;
    private void start(){
        hilo=new Thread(this);
    }
    private void stop(){
        hilo.stop();
        
    }
    @Override
    public void run() {
        Backapear bb=new BackUp();
        bb.GenerarArchivos();
        
        /*
        try{
            BkDeConeccion1 bk=new BkDeConeccion1();
            bk.procesosDeCierre();
        }finally{
            try {
                if(this!=null){
                    
                }else{
                this.stop();
                }
            } catch (Throwable ex) {
                Logger.getLogger(Actualiza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */
    }
    
}
