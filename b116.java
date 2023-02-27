package buoi3a;

public class b116 {
//    input,output
//    neu khong hop le output=-1
    public static long tongS(int n){
        if (n<0){
            return -1;
        }
        long t=0;
        for (int i=1;i<=n;i++){
            t=t+i;
        }
//        KHONG NEN IN CAC GIA TRI TRA VE
        return t;
    }
    public static void main(String[] args) {
        System.out.println(tongS(3));

    }
}
