package TinhHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(20,15);
        double chuVi = hcn.tinhChuVi();
        System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        double dienTich = hcn.tinhDienTich();
        System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        // Cach khac: thay tu dong so 8
        // System.out.println("Chu vi hinh chu nhat la: " + hcn.tinhChuVi());//
        //System.out.println("Chu vi hinh chu nhat la: " + hcn.tinhDienTich());//
    }
}
