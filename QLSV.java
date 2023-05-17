/* Lâm Thị Phương Thảo */
package Bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    private ArrayList<SinhVien> qlsv = new ArrayList<SinhVien>();
    Scanner sc = new Scanner(System.in);
    SinhVien sv;

    public QLSV() {
    }

    public QLSV(ArrayList<SinhVien> qlsv) {
        this.qlsv = qlsv;
    }
    
    public void Nhap(){
        //Phải làm lại trùng mã sinh viên
        sc.nextLine();
        System.out.print("Nhap ma sinh vien: "); String masv = sc.nextLine();
        System.out.print("Nhap ho va ten sinh vien: "); String hoten = sc.nextLine();
        System.out.print("Nhap nam sinh: "); int namsinh = sc.nextInt();
        sv = new SinhVien(masv, hoten, namsinh);
        qlsv.add(sv);
    }
    public void in(){
        for (SinhVien sv : qlsv) {
            System.out.println(sv.toString());
        }
    }

    @Override
    public String toString() {
        return "QLSV{" + "qlsv=" + qlsv + ", sc=" + sc + ", sv=" + sv + '}';
    }
    
    public void TimSvTheoMa(String masv)
    {
        for (SinhVien sinhvien : qlsv) {
            if(sinhvien.getMasv().indexOf(masv)>=0){
                System.out.println("Sinh vien duoc tim theo ma: ");
                System.out.println(sinhvien);
            }
        }
    }
    
    public void TimSvTheoTen(String hoten)
    {
        for (SinhVien sinhvien : qlsv) {
            if(sinhvien.getHoten().indexOf(hoten)>=0){
                System.out.println("Sinh vien duoc tim theo ten: ");
                System.out.println(sinhvien);
            }
        }
    }
    
    public void XoaSinhVienTheoMa(String masv){
        for (SinhVien sinhvien : qlsv) {
            if(sinhvien.getMasv().indexOf(masv)>=0){
                System.out.println("Sinh vien duoc xoa theo ma: ");
                qlsv.remove(sinhvien);
                System.out.println("Da xoa");
            }
        }
    }
    public void SapXepSVTangDan(){
        Collections.sort(qlsv, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                //them ham so sanh
                return sv1.getMasv().compareTo(sv2.getMasv());
            }
            
        });
    }
    
    public void SuaThongTinSV(String masv){
        SinhVien SuaSV = null;
        for (SinhVien sv : qlsv) {
            if(sv.getMasv().equals(masv)){
                SuaSV = sv;
                break;
            }
        }
        if(SuaSV == null ){
            System.out.println("Sinh vien khong ton tai!!!");
        }else{
            sc.nextLine();
            System.out.println("Nhap lai ten can sua: "); String newten = sc.nextLine();
            System.out.println("Nhap lai nam sinh"); int newnamsinh = sc.nextInt();
            
            SuaSV.setHoten(newten);
            SuaSV.setNamsinh(newnamsinh);
        }
        
    }
}
