
package lab7_fabiohenriquez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class admin_mensajes {
    
    private ArrayList<Mensajes> mensajes = new ArrayList();
    private File Archivo;

    public admin_mensajes(String path) {
        Archivo = new File(path);
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    
    public void escribirArchivo() throws FileNotFoundException, IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
           fw = new FileOutputStream(Archivo);
           bw = new ObjectOutputStream(fw);
            for (Mensajes t : mensajes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
           
        }finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }
    }
   public void cargarArchivo(){
        try {
            mensajes = new ArrayList();
            Mensajes temp;
            if (Archivo.exists()) {
                FileInputStream entrada = new FileInputStream(Archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Mensajes)objeto.readObject())!=null) {                        
                        mensajes.add(temp);
                    }
   
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }//Fin if
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
