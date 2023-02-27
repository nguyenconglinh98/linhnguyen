package buoi3a;

public class B117 {
//    luy thua a^b
    public static double pow(double a,int b){
//        tri tuyet doi cua b
        int c=Math.abs(b);
        double rs=1;
        for (int i=1;i<=c;i++){
            rs=rs*a;

        }
        if (b<0) return 1/rs;
        return rs;
    }
    public static double sn(double x,double n){
        if (n<=0){
            return -1;
        }
        double t=0;
        for (int i=1;i<=n;i++){
            t=t+pow(x,i);
        }
        return t;
    }
    public static void main(String[] args) {;
        System.out.println(sn(3,5));
    }
}
