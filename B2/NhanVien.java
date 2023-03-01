package kiemtra.B2;

public abstract class  NhanVien {
    private String MaNV;
    private String HoVaTen;
    private String NamSinh;
    private String DiaChi;

    public NhanVien(String maNV) {
        MaNV = maNV;
    }
    public NhanVien(String maNV, String hoVaTen, String namSinh, String diaChi) {
        MaNV = maNV;
        HoVaTen = hoVaTen;
        NamSinh = namSinh;
        DiaChi = diaChi;

    }

    public String getMaNV() {
        return MaNV;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNV='" + MaNV + '\'' +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", NamSinh='" + NamSinh + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
    public abstract String moTaCongViec();

}
