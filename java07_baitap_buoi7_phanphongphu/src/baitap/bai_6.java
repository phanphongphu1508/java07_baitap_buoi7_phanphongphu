package baitap;
import java.util.Scanner;
public class bai_6 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Nhập vào chiều rộng: ");
		double chieuRong = banPhim.nextDouble();
		banPhim.close();
		
		if (chieuRong <= 0) {
			System.out.println("Vui lòng nhập chiều rộng lớn hơn 0");
			return;
		}
		dienTich(chieuRong);
		chuVi(chieuRong);
	}
	public static void dienTich(double chieuRong) {
		System.out.println("Diện tích hình vuông là " + (chieuRong * chieuRong)); 
	}
	public static void chuVi(double chieuRong) {
		System.out.println("Chu vi hình vuông là " + (4 * chieuRong)); 
	}
}