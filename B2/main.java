package kiemtra.B2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KyThuat kt1 = new KyThuat("t1","Linh","09/04/1998","Bac Ninh","Dien tu");
        KyThuat kt2 = new KyThuat("dsd");
        System.out.print("Nhap ten:");
        kt2.setHoVaTen(scanner.nextLine());
        System.out.print("Nhap ngay sinh theo dang dd/mm/yyyy:");
        kt2.setNamSinh(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        kt2.setDiaChi(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kt2.setChuyenNganh(scanner.nextLine());
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }

}
