package baitap;
import java.util.Scanner;
public class bai_1_1 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên: ");
		int soNguyen = banPhim.nextInt();
		banPhim.close();
		
		// In ra "Số chẵn", "Số lẻ"
		if (soNguyen % 2 == 0) {
			System.out.print("Số chẵn");
		} 
		if (soNguyen % 2 != 0) {
			System.out.print("Số lẻ");
		}
	}
}