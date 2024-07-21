package baitap;
import java.util.Scanner;
public class bai_1 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên: ");
		int soNguyen = banPhim.nextInt();
		
		banPhim.close();
		
		if (soNguyen >= 0 ) {
			System.out.println("Đây là số nguyên dương");
		}
		else {
			System.out.println("Đây là số nguyên âm");
		}	
	}
}
