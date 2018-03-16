/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_fabiohenriquez;

/**
 *
 * @author FABIO
 */
public class pc {
    private String ip;
    private String mascara;

    public pc() {
    }

    public pc(String ip, String mascara) {
        this.ip = ip;
        this.mascara = mascara;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    @Override
    public String toString() {
        return "pc{" + "ip=" + ip + ", mascara=" + mascara + '}';
    }
    
    
}
