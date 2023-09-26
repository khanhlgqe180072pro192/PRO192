import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
     public static void main(String[] args) {
            // Khởi tạo danh sách họ tên
            ArrayList<String> names = new ArrayList<>();
            names.add("Nguyễn Văn A");
            names.add("Trần Thị B");
            // ...

            // Nhập họ tên từ bàn phím
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập họ tên:");
            String inputName = scanner.nextLine();

            // Kiểm tra xem họ tên có tồn tại trong danh sách hay không
            if (names.contains(inputName)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
