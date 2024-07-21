package baitap;
import java.util.Scanner;
public class bai_5 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		int phanTu;
		
		do {
			System.out.print("Nhập vào phần tử: ");
			phanTu = banPhim.nextInt();
			if (phanTu <= 0) {
				System.out.print("Vui lòng nhập số phần tử lớn hơn 0!");
			}
		} while (phanTu <= 0);
		
		int[] mang = new int[phanTu];
		
		for (int i = 0; i < phanTu; i++) {
			System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
			mang[i] = banPhim.nextInt();
		}
		banPhim.close();
		timSoLonNhat(mang);
		timSoNhoNhat(mang);
	}
	// Hàm tìm số lớn nhất
	public static void timSoLonNhat(int[] mang) {
		int max = mang[0];
		for (int i = 0; i < mang.length; i++) {
			if (max < mang[i]) {
				max = mang[i];
			}
		}
		System.out.println("Số lớn nhất của mảng là " + max);
	}
	// Hàm tìm số nhỏ nhất
	public static void timSoNhoNhat(int[] mang) {
		int min = mang[0];
		for (int i = 0; i < mang.length; i++) {
			if (min > mang[i]) {
				min = mang[i];
			}
		}
		System.out.println("Số nhỏ nhất của mảng là " + min);
	}
}
