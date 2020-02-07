package Thu;

public class Hocsinh {
    public String MaHocVien;
    public String TenHocVien;
    public String GmailHocVien;
    public int Diem;

    public String getMaHocVien() {
        return MaHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        MaHocVien = maHocVien;
    }

    public String getTenHocVien() {
        return TenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        TenHocVien = tenHocVien;
    }

    public String getGmailHocVien() {
        return GmailHocVien;
    }

    public void setGmailHocVien(String gmailHocVien) {
        GmailHocVien = gmailHocVien;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int diem) {
        Diem = diem;
    }

    public Hocsinh(String maHocVien, String tenHocVien, String gmailHocVien, int diem) {
        this.MaHocVien = maHocVien;
        TenHocVien = tenHocVien;
        GmailHocVien = gmailHocVien;
        Diem = diem;
    }

    @Override
    public String toString() {
        return "Hocsinh{" +
                "MaHocVien='" + MaHocVien + '\'' +
                ", TenHocVien='" + TenHocVien + '\'' +
                ", GmailHocVien='" + GmailHocVien + '\'' +
                ", Diem=" + Diem +
                '}';
    }
}
