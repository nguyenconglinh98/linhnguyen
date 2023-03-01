package kiemtra.B2;

public class KyThuat extends NhanVien {
private String ChuyenNganh;

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNV, String hoVaTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNV, hoVaTen, namSinh, diaChi);
        ChuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNV) {
        super(maNV);
    }

    @Override
    public String moTaCongViec() {
        return "lam cac cv Ky thuat";
    }
}
