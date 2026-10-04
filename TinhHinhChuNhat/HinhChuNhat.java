package TinhHinhChuNhat;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat (int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    } // co doanj nay roi thi k can tao doi tuong hcn

    public double tinhChuVi () { // da khai bao r thi trong ngoac k can viet gi
        double chuVi = 2 * (this.chieuDai + this.chieuRong); // viet ro han this de biet duoc minh dang lam vc vs phan nao
        return chuVi;
    }

    public double tinhDienTich () {
        double dienTich = chieuDai * chieuRong;
        return dienTich;
    }
}
