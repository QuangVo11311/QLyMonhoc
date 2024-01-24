import java.util.Scanner;

public class MonThucHanh extends MonHoc {
    private double diemTieuLuan;
    private double diemGiuaKi;
    private double diemCuoiKi;
    private double diemTrungBinh;
    private double HocPhi;

    public MonThucHanh() {
        super();
        this.diemTieuLuan = 0;
        this.diemGiuaKi = 0;
        this.diemCuoiKi = 0;
        this.diemTrungBinh = 0;
        this.HocPhi = 0;
    }

    public MonThucHanh(String maMon, String tenMonHoc, int soTinChi, String khoaPhuTrach,
                       double diemTieuLuan, double diemGiuaKi, double diemCuoiKi, double diemTrungBinh, double HocPhi) {
        super(maMon, tenMonHoc, soTinChi, khoaPhuTrach);
        this.diemTieuLuan = diemTieuLuan;
        this.diemGiuaKi = diemGiuaKi;
        this.diemCuoiKi = diemCuoiKi;
        this.diemTrungBinh = diemTrungBinh;
        this.HocPhi = HocPhi;
    }

    public double getDiemTieuLuan() {
        return diemTieuLuan;
    }

    public void setDiemTieuLuan(double diemTieuLuan) {
        this.diemTieuLuan = diemTieuLuan;
    }

    public double getDiemGiuaKi() {
        return diemGiuaKi;
    }

    public void setDiemGiuaKi(double diemGiuaKi) {
        this.diemGiuaKi = diemGiuaKi;
    }

    public double getDiemCuoiKi() {
        return diemCuoiKi;
    }

    public void setDiemCuoiKi(double diemCuoiKi) {
        this.diemCuoiKi = diemCuoiKi;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double hocPhi) {
        HocPhi = hocPhi;
    }

    @Override
    public void HandleEvent() {
        this.diemTrungBinh = (this.diemCuoiKi + this.diemGiuaKi + this.diemTieuLuan) / 3;
        this.HocPhi = super.getSoTinChi() * 350000 + 100000;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10d %-15s %-14.2f %-14.2f %-14.2f %-14.2f %-20.2f",
                super.getMaMon(), super.getTenMonHoc(), super.getSoTinChi(), super.getKhoaPhuTrach(),
                this.diemGiuaKi, this.diemCuoiKi, this.diemTieuLuan, this.diemTrungBinh, this.HocPhi);
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Diem Tieu Luan: "); this.diemTieuLuan = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Diem Giua Ky: "); this.diemGiuaKi = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Diem Cuoi Ky: "); this.diemCuoiKi = Integer.parseInt(new Scanner(System.in).nextLine());
    }

    @Override
    public void output() {
        HandleEvent();
        System.out.printf("%-10s %-15s %-10s %-15s %-14s %-14s %-14s %-14s %-20s\n",
                "MaMon", "TenMonHoc", "SoTinChi", "KhoaPhuTrach",
                "DiemGiuaKi", "DiemCuoiKi", "DiemTieuLuan", "DiemTrungBinh", "HocPhi");
        System.out.println(toString());
    }
}
