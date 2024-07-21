package baitap;
import java.util.Scanner;
public class bai_1_2 {
	public static void main(String[] args) {
		
		int count = 0;
		Scanner banPhim = new Scanner(System.in);
		System.out.print("Vui lòng nhập vào số nguyên: ");
		int num = banPhim.nextInt();
		banPhim.close();
		
		if(num > 0) {
			for (int i = 0; i <= num; i++) {
				if (num % i == 0) {
					count++;
					if (count == 0) {
						System.out.print("Số nguyên tố");
					}else {
						System.out.print("Không phải là số nguyên tố");
					}
				}	
			}
		} else {
			System.out.print("Không hợp lệ!");
		}
	}
}
