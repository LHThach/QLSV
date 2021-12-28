package btl2;

public class Student {

    public String fullName, dob, msv, gender,khoa,lop;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Student(String msv, String fullName, String gender, String dob) {
        this.msv = msv;
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
    }

    public Student(String fullName, String gender, String dob) {
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
    }
    Student(){
        
        
    }
}
