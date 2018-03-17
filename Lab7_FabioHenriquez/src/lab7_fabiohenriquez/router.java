
package lab7_fabiohenriquez;


public class router {
    
    private String ip;
    private String mascara;
    private String protocolo;
    private int vt;
    private int vr;

    public router() {
    }

    public router(String ip, String mascara, String protocolo, int vt, int vr) {
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

    public int getVt() {
        return vt;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }

    public int getVr() {
        return vr;
    }

    public void setVr(int vr) {
        this.vr = vr;
    }

    @Override
    public String toString() {
        return "router{" + "ip=" + ip + ", mascara=" + mascara + ", protocolo=" + protocolo + ", vt=" + vt + ", vr=" + vr + '}';
    }
    
    
    
}
