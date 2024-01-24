import java.util.Scanner;

public class MonDoAN extends MonHoc{
    private double diemGVHD;
    private double diemGVPB;
    private double diemTrungBinh;
    private double HocPhi;

    public MonDoAN() {
        super();
        this.diemGVHD = 0;
        this.diemGVPB = 0;
        this.diemTrungBinh = 0;
        this.HocPhi = 0;
    }

    public MonDoAN(String maMon, String tenMonHoc, int soTinChi, String khoaPhuTrach,
                   double diemGVHD, double diemGVPB, double hocPhi, double diemTrungBinh) {
        super(maMon, tenMonHoc, soTinChi, khoaPhuTrach);
        this.diemGVHD = diemGVHD;
        this.diemGVPB = diemGVPB;
        this.diemTrungBinh = diemTrungBinh;
        this.HocPhi = hocPhi;
    }

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemGVPB() {
        return diemGVPB;
    }

    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.HocPhi = hocPhi;
    }

    @Override
    public void HandleEvent() {
        this.diemTrungBinh = (this.diemGVHD*2 + this.diemGVPB) / 3;
        this.HocPhi = 200000;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10d %-15s %-14.2f %-14.2f %-14.2f %-20.2f",
                super.getMaMon(), super.getTenMonHoc(), super.getSoTinChi(), super.getKhoaPhuTrach(),
                this.diemGVPB, this.diemGVHD, this.diemTrungBinh, this.HocPhi);
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Diem GVHD: "); this.diemGVHD = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Diem GVPB: "); this.diemGVPB = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public void output() {
        HandleEvent();
        System.out.printf("%-10s %-15s %-10s %-15s %-14s %-14s %-14s %-20s\n",
                "MaMon", "TenMonHoc", "SoTinChi", "KhoaPhuTrach",
                "Diem GVHD", "Diem GVHD", "DiemTrungBinh", "HocPhi");
        System.out.println(toString());
    }
}
