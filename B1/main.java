package kiemtra;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Nhập bán kính: ");
            radius = in.nextDouble();
            if (radius < 0) {
                throw new RuntimeException("Error");
            }
            System.out.println(new Circle(radius));
        } catch (NumberFormatException e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


