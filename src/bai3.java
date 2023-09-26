import java.util.Scanner;
public class bai3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập điểm chuyên cần:");
            double diemChuyenCan = scanner.nextDouble();

            System.out.println("Nhập điểm giữa kì:");
            double diemGiuaKi = scanner.nextDouble();

            System.out.println("Nhập điểm cuối kì:");
            double diemCuoiKi = scanner.nextDouble();

            double diemHocPhan = diemChuyenCan * 0.1 + diemGiuaKi * 0.2 + diemCuoiKi * 0.7;
            System.out.println("Điểm học phần của bạn là: " + diemHocPhan);
        }
    }
