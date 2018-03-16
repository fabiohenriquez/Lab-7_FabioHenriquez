
package lab7_fabiohenriquez;


public class router {
    
    private String ip;
    private String mascara;
    private String protocolo;
    private double vt;
    private double vr;

    public router() {
    }

    public router(String ip, String mascara, String protocolo, double vt, double vr) {
        this.ip = ip;
        this.mascara = mascara;
        this.protocolo = protocolo;
        this.vt = vt;
        this.vr = vr;
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

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public double getVt() {
        return vt;
    }

    public void setVt(double vt) {
        this.vt = vt;
    }

    public double getVr() {
        return vr;
    }

    public void setVr(double vr) {
        this.vr = vr;
    }
    
    
}
