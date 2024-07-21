package baitap;
import java.util.Scanner;
public class bai_3 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		int soNguyen;
		do {
			System.out.print("Nhập vào số nguyên: ");
			soNguyen = banPhim.nextInt();
			if (soNguyen < 0) {
				System.out.println("Vui lòng nhập vào số nguyên dương!");
			}
		} while (soNguyen < 0);
		banPhim.close();
		System.out.println("Tổng tất cả số chẵn là: " + tinhTong(soNguyen));
	}
	public static int tinhTong(int soNguyen) {
		int tong = 0;
		if (soNguyen > 0) {
			for (int i = 0; i <= soNguyen; i++) {
				if (i % 2 == 0) { 
				tong += i;
				}
			}
		}
	return tong;
	}
}