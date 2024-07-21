package baitap;
import java.util.Scanner;
public class bai_2 {
	public static void main(String[] args) {
		
		int soNguyen;
		String[] chuSo = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};
		
		Scanner banPhim = new Scanner(System.in);
		
		do {
			System.out.print("Nhập vào số nguyên: ");
			soNguyen = banPhim.nextInt();

			if(soNguyen >= 1 && soNguyen <= 10) {
				System.out.print(chuSo[soNguyen - 1]);
			}
			else {
				System.out.println("Không hợp lệ! Vui lòng nhập số nguyên từ 1 đến 10.");
			}
		} while (soNguyen < 1 || soNguyen > 10);
		
		banPhim.close();
	}
}
