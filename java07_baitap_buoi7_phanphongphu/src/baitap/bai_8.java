package baitap;
import java.util.Scanner;
public class bai_8 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		int phanTu;
		do {
			System.out.print("Nhập vào số phần tử: ");
			phanTu = banPhim.nextInt();
			if (phanTu < 0) {
				System.out.println("Vui lòng nhập phần tử lớn hơn 0!");
			}	
			if (phanTu == 0) {
				System.out.println("Mảng rỗng");
				return;
			} 
		} while (phanTu <= 0);
		
		int[] mangSo = new int[phanTu];
		
		for(int i = 0; i < mangSo.length; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			mangSo[i] = banPhim.nextInt();
		}
		boolean kiemTra = false;
		System.out.println("Phần tử số chẵn là: ");
		for (int i: mangSo) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
				kiemTra = true;
			}
		}
		if(!kiemTra) {
			System.out.print("Mảng không có phần tử số chẵn");
		}
	}
}