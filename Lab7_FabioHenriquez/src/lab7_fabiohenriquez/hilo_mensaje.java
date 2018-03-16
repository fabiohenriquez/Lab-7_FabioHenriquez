/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_fabiohenriquez;

import javax.swing.JTable;

/**
 *
 * @author FABIO
 */
public class hilo_mensaje extends Thread {
    JTable tabla1;
    private boolean avanzar;
    private boolean vive;

    public hilo_mensaje(JTable tabla1) {
        this.tabla1 = tabla1;
        avanzar = true;
        vive = true;
    }

    public JTable getTabla1() {
        return tabla1;
    }

    public void setTabla1(JTable tabla1) {
        this.tabla1 = tabla1;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
     @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                tabla.setValue(barra.getValue() + 1);
                if (barra.getValue() == 100000000) {
                    vive = false;
                }

                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    
    
    
    
}
