import java.util.Scanner;
public class bai2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập họ: ");
            String ho = scanner.nextLine();

            System.out.print("Nhập tên: ");
            String ten = scanner.nextLine();

            String tenDayDu = ho + " " + ten;

            System.out.println("Tên đầy đủ của bạn là: " + tenDayDu);
        }
    }
