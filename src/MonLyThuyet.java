import java.util.Scanner;

public class MonLyThuyet extends MonHoc{
    private double diemTieuLuan;
    private double diemGiuaKi;
    private double diemCuoiKi;

    public MonLyThuyet() {
        super();
        this.diemTieuLuan = 0;
        this.diemGiuaKi = 0;
        this.diemCuoiKi = 0;
    }

    public MonLyThuyet(String maMon, String tenMonHoc, int soTinChi,
                       String khoaPhuTrach, double diemTieuLuan, double diemGiuaKi, double diemCuoiKi) {
        super(maMon, tenMonHoc, soTinChi, khoaPhuTrach);
        this.diemTieuLuan = diemTieuLuan;
        this.diemGiuaKi = diemGiuaKi;
        this.diemCuoiKi = diemCuoiKi;
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

    @Override
    public void HandleEvent() {

    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10d %-15s %-8.2f %-8.2f %-8.2f",
                super.getMaMon(), super.getTenMonHoc(), super.getSoTinChi(), super.getKhoaPhuTrach(),
                this.diemGiuaKi, this.diemCuoiKi, this.diemTieuLuan);
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
        System.out.printf("%-10s %-15s %-10s %-15s %-8s %-8s %-8s\n",
                "MaMon", "TenMonHoc", "SoTinChi", "KhoaPhuTrach", "DiemGiuaKi", "DiemCuoiKi", "DiemTieuLuan");
        System.out.println(toString());
    }
}
