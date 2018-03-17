
package lab7_fabiohenriquez;


public class c_switch {
    private String nombre;
    private int v_transmision;
    private int v_recepcion;

    public c_switch() {
    }

    
    
    public c_switch(String nombre, int v_transmision, int v_recepcion) {
        this.nombre = nombre;
        this.v_transmision = v_transmision;
        this.v_recepcion = v_recepcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getV_transmision() {
        return v_transmision;
    }

    public void setV_transmision(int v_transmision) {
        this.v_transmision = v_transmision;
    }

    public int getV_recepcion() {
        return v_recepcion;
    }

    public void setV_recepcion(int  v_recepcion) {
        this.v_recepcion = v_recepcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
}
