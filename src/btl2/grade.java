package btl2;

import java.io.Serializable;

public class grade implements Serializable {

    public String msv, fullname, mon;
    public float dtx, dgk, dck,avg;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public float getDtx() {
        return dtx;
    }

    public void setDtx(float dtx) {
        this.dtx = dtx;
    }

    public float getDgk() {
        return dgk;
    }

    public void setDgk(float dgk) {
        this.dgk = dgk;
    }

    public float getDck() {
        return dck;
    }

    public void setDck(float dck) {
        this.dck = dck;
    }

    public float getAvg() {
        avg = 1/5 *dtx+ 1/5*dgk+ 3/5*dck;
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    

    public grade(String msv, String fullname, String mon, float dtx, float dgk, float dck, float avg) {
        this.msv = msv;
        this.fullname = fullname;
        this.mon = mon;
        this.dtx = dtx;
        this.dgk = dgk;
        this.dck = dck;
        this.avg = avg;
    }

    public grade(String msv, String mon, float dtx, float dgk, float dck) {
        this.msv = msv;
        this.mon = mon;
        this.dtx = dtx;
        this.dgk = dgk;
        this.dck = dck;
    }

    grade() {
        this.msv = msv;
        this.fullname = fullname;
        this.mon = mon;
        this.dtx = dtx;
        this.dgk = dgk;
        this.dck = dck;
        this.avg= avg;
    }
}
