package baitap;
import java.util.Scanner;
public class bai_4 {
	public static void main(String[] args) {
		
		int soNguyen;
		int tinhTong = 0;
		double trungBinh;
		Scanner banPhim = new Scanner(System.in);
		
		do {
			System.out.print("Nhập vào số nguyên n: ");
			soNguyen = banPhim.nextInt();
			if (soNguyen <= 0) {
				System.out.println("Vui lòng nhập vào số nguyên lớn hơn 0!");
			}
		} while (soNguyen <= 0);
		
		int[] mang = new int [soNguyen];
		
		for (int i = 0; i < soNguyen; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mang[i] = banPhim.nextInt();	
			tinhTong += mang[i];
		}
		banPhim.close();
		
		trungBinh = (double)tinhTong / soNguyen;
		System.out.print("Giá trị trung bình của mảng là: " + trungBinh);
	}
}
