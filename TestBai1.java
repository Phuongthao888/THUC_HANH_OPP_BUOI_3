/* Lâm Thị Phương Thảo */
package TH3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Order or = new Order();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Menu");
            System.out.println("1. Nhap");
            System.out.println("2. In");
            System.out.print("Lua chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1: 
                    or.Nhap();
                    break;
                case 2:
                    or.in();
                    break;
                default:
                    if(menu != 3)
                    System.out.println("Chuc nang khong ton tai! ");
                else 
                    System.out.println("Da thoat");
            }
        }while(menu!=3);
    }
}
