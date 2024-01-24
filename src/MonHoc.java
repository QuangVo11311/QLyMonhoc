import java.util.Scanner;

public abstract class MonHoc {
    private String MaMon;
    private String TenMonHoc;
    private int SoTinChi;
    private String KhoaPhuTrach;

    public MonHoc() {
        MaMon = null;
        TenMonHoc = null;
        SoTinChi = 0;
        KhoaPhuTrach = null;
    }

    public MonHoc(String maMon, String tenMonHoc, int soTinChi, String khoaPhuTrach) {
        this.MaMon = maMon;
        this.TenMonHoc = tenMonHoc;
        this.SoTinChi = soTinChi;
        this.KhoaPhuTrach = khoaPhuTrach;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        this.MaMon = maMon;
    }

    public String getTenMonHoc() {
        return TenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.TenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.SoTinChi = soTinChi;
    }

    public String getKhoaPhuTrach() {
        return KhoaPhuTrach;
    }

    public void setKhoaPhuTrach(String khoaPhuTrach) {
        this.KhoaPhuTrach = khoaPhuTrach;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-5s %-15s",
                this.MaMon, this.TenMonHoc, this.SoTinChi, this.KhoaPhuTrach);
    }

    public void input() {
        System.out.print("Ma Mon: "); this.MaMon = (new Scanner(System.in)).nextLine();
        System.out.print("Ten Mon Hoc: "); this.TenMonHoc = (new Scanner(System.in)).nextLine();
        System.out.print("Tin Chi: "); this.SoTinChi = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Khoa phu trach: "); this.KhoaPhuTrach = (new Scanner(System.in)).nextLine();
    }

    public void output() {
        System.out.println(toString());
    }

    public abstract void HandleEvent();
}
