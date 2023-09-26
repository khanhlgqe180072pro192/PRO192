# PRO192
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.println("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        System.out.println("Tổng của hai số là: " + (num1 + num2));
        System.out.println("Hiệu của hai số là: " + (num1 - num2));
        System.out.println("Tích của hai số là: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Thương của hai số là: " + (num1 / num2));
        } else {
            System.out.println("Không thể chia cho 0");
        }
    }
}
