/* Lâm Thị Phương Thảo */
package Bai3;

public class SinhVien implements Comparable<SinhVien>{
    private String masv;
    private String hoten;
    private int namsinh;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, int namsinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", hoten=" + hoten + ", namsinh=" + namsinh + '}';
    }

    @Override
    public int compareTo(SinhVien sv) {
        return this.getMasv().compareTo(sv.getMasv());
    }
    
}
