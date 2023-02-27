package buoi3a;

public class b115 {
    public static void inthongtin(String hoten,double dt,double dv){
        if(dv<0||dt<0||dv>10||dt>10){
            System.out.println("khong hop le ");
            return;
        }
        double tb=(dt+dv)/2;
        System.out.printf("Hocsinh[hoten:%s,diemtb:%.2f]\n",hoten,tb);
    }

    public static void main(String[] args) {
        inthongtin("Nguyen a",8,9);
        inthongtin("dsdad",5,6);
    }
}
