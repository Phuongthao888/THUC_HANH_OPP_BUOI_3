package Bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("menu");
            System.out.println("1. Nhap \n"
                    + "2. in \n" 
                    + "3. Tim sinh vien theo ma \n"
                    + "4. Tim sinh vien theo ten \n"
                    + "5. sap xep danh sach sinh vien tang dan \n"
                    + "6. Xoa sinh vien \n"
                    + "7. Sua thong tin sinh vien \n"
                    + "0. Thoat \n"
                    + "Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    qlsv.Nhap();
                    break;
                case 2:
                    qlsv.in();
                    break;
                case 3:
                    String masv; sc.nextLine();
                    System.out.print("Nhap ma sinh vien can tim: "); masv = sc.nextLine();
                    qlsv.TimSvTheoMa(masv);
                    break;
                case 4:
                    String hoten; sc.nextLine();
                    System.out.print("Nhap ten sinh vien can tim: "); hoten = sc.nextLine();
                    qlsv.TimSvTheoTen(hoten);
                    break;
                case 5:
                    qlsv.SapXepSVTangDan();
                    qlsv.in();
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Nhap ma sinh vien can xoa: "); masv = sc.nextLine();
                    qlsv.XoaSinhVienTheoMa(masv);
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Nhap ma sinh vien can sua: "); masv = sc.nextLine();
                    qlsv.SuaThongTinSV(masv);
                    break;
                default:
                     if(menu != 0)
                    System.out.println("Chuc nang khong ton tai! ");
                    else 
                    System.out.println("Da thoat");
            }
        }while(menu!=0);
    }
}
