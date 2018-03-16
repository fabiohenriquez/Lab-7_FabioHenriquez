
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
    private boolean estado = false;
    private JTable tabla;
    private router r;
    private ArrayList<pc> pcs = new ArrayList();
    //private File archivo = new File("./mensajes.txt");

    public Mensajes() {
    }

    public Mensajes(String ip_origen, String ip_destino, String titutlo, String contenido) {
        this.ip_origen = ip_origen;
        this.ip_destino = ip_destino;
        this.titulo = titutlo;
        this.contenido = contenido;
        avanzar = true;
        vive = true;
        
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                Object[] newrow = {
                    titulo,
                   "Router" + r.getIp(),};
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(newrow);
                tabla.setModel(modelo);

                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                }
            }
            estado = true;
        }
    }
   
   
}