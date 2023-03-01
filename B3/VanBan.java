package kiemtra.B3;

public class VanBan {
    String ChuoiKyTu;

    public VanBan() {
    }

    public VanBan(String chuoiKyTu) {
        ChuoiKyTu = chuoiKyTu;
    }

    public String getChuoiKyTu() {
        return ChuoiKyTu;
    }

    public void setChuoiKyTu(String chuoiKyTu) {
        ChuoiKyTu = chuoiKyTu;
    }
//    Xây dựng phương thức: chuẩn hoá một xâu theo tiêu chuẩn (Ở đầu và cuối của xâu không
//có ký tự trống, ở giữa xâu không có hai ký tự trắng liền nhau).
    public String khoangTrong(String chuoiKyTu){
       chuoiKyTu.trim();
       chuoiKyTu.replace("","");
        return chuoiKyTu;
    }
//    Xây dựng phương thức: chuyển đổi toàn bộ văn bản thành viết hoa.
    public String Viethoa(String chuoiKyTu){
        return chuoiKyTu.toUpperCase();
    }
//    Xây dựng phương thức: chuyển đổi toàn bộ văn bản thành viết thường.
    public String vietThuong(String chuoiKyTu){
        return chuoiKyTu.toLowerCase();
    }
    public String VHchuCaiDau (String chuoiKyTu){
        String chucaidau = chuoiKyTu.substring(0,1);
        String remainingLetters = chuoiKyTu.substring(1, chuoiKyTu.length());
        chucaidau = chucaidau.toUpperCase();
        chuoiKyTu = chucaidau +remainingLetters;
        return chuoiKyTu;
    }

}
