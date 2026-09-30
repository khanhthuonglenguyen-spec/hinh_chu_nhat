package BaiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap cap bac: ");
        String grade = sc.next();
        System.out.println("Vui long nhap luong: ");
        double salary = sc.nextDouble();
        int allowance = 100; //default la Grade Others

        if (grade.equalsIgnoreCase("A")) {
            allowance = 300;
        } else if (grade.equalsIgnoreCase("B")) {
            allowance = 250;
        }
        salary += allowance;
        System.out.println("Luong cuoi thang: " + salary);
        sc.close();
}
}
