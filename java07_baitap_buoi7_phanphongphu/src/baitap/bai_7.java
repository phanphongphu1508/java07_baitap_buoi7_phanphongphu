package baitap;
import java.util.Random;
import java.util.Scanner;
public class bai_7 {
	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		int phanTu;
		/* 
		 * Nếu nhập vào phần tử nhỏ hơn hoặc bằng 0
		 * cảnh báo và cho nhập lại
		*/ 
		do {
			System.out.print("Nhập vào phần tử: ");
			phanTu = banPhim.nextInt();
			if (phanTu < 0) {
				System.out.println("Vui lòng nhập phần tử lớn hơn 0!");
			}
			if (phanTu == 0) {
				System.out.println("Mảng rỗng");
				return;
			}
			banPhim.close();
		} while (phanTu <= 0);
		
		int[] mang = new int[phanTu];
		phanTuMang(mang);
	}
	public static void phanTuMang(int[] mang) {
		Random random = new Random();
		// Phần tử tự động của mảng trong phạm vi từ 1 đến 99
		int min = 1;
		int max = 99;
		// Tạo phần tử tự động trong mảng
		for(int i = 0; i < mang.length; i++) {
			mang[i] = random.nextInt(max - min + 1) + min;
		}	
		System.out.println("Phần tử trong mảng là: ");
		for (int i: mang) {
		System.out.print(i + "\t");
		}
	}
}