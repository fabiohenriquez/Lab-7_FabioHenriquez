
package lab7_fabiohenriquez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Mensajes extends Thread {
    
    private String ip_origen;
    private String ip_destino;
    private String titulo;
    private String contenido;
     private boolean avanzar;
    private boolean vive;
    private boolean avanzar_r;
    private boolean avanzar_pc;
    private boolean estado = false;
    private JTable tabla;
    private int s_transmision;
    private int s_receptor;
    private int r_receptor;
    private int r_transmision;
    
    //private File archivo = new File("./mensajes.txt");

    public Mensajes() {
    }

    public Mensajes(int s_transmision,int s_receptor,int r_receptor,int r_transmision,JTable tabla,String ip_origen, String ip_destino, String titutlo, String contenido) {
       this.tabla = tabla;
        this.ip_origen = ip_origen;
        this.ip_destino = ip_destino;
        this.titulo = titutlo;
        this.contenido = contenido;
        this.s_transmision = s_transmision;
        this.s_receptor = s_receptor;
        this.r_transmision = r_transmision;
        this.r_receptor = r_receptor;
        avanzar = true;
        vive = true;
        avanzar_r = true;
        avanzar_pc = true;
        
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public void setIp_origen(String ip_origen) {
        this.ip_origen = ip_origen;
    }

    public String getIp_destino() {
        return ip_destino;
    }

    public void setIp_destino(String ip_destino) {
        this.ip_destino = ip_destino;
    }

    public String getTitutlo() {
        return titulo;
    }

    public void setTitutlo(String titutlo) {
        this.titulo = titutlo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
    

    
    @Override
    public void run() {
        String est="Entregado";
        
        
        while (vive) {
             try {
                    Thread.sleep(s_receptor);
                } catch (InterruptedException e) {
                }
            if (avanzar) {
                Object[] newrow = {
                    titulo,
                   "Switch" ,r_transmision,est};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(newrow);
                tabla.setModel(modelo);

                try {
                    Thread.sleep(r_receptor);
                } catch (InterruptedException e) {
                }
            }
            avanzar = false;
            if(avanzar_pc){
                Object[] newrow = {
                    titulo,
                   "PC","" ,"",est};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(newrow);
                tabla.setModel(modelo);

                try {
                    Thread.sleep(s_transmision);
                } catch (InterruptedException e) {
                }
            }
            avanzar_pc = false;
            estado = true;
        }
    }
   
   
}