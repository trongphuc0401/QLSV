package test;

import java.util.Scanner;
import QLSV.DanhSachSinhVien;
import QLSV.SinhVien;
public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		DanhSachSinhVien dssv  =  new DanhSachSinhVien();
		int luachon = 0;
		do {
			System.out.println("------Menu-----");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "0.   Thoát khỏi chương trình");
					luachon = sc.nextInt();
					if(luachon==1) {
						System.out.println("Nhập mã sinh viên: ");String maSinhVien  = sc.nextLine();
						System.out.println("Nhập họ và tên: ");String hoVaTen  = sc.nextLine();
						System.out.println("Nhập năm sinh: ");int namSinh  = sc.nextInt();
						System.out.println("Nhập điểm trung bình: ");float diemTrungBinh  = sc.nextFloat();
						dssv.themSinhVien(sv);
					}else if(luachon==2) {
						
					}else if(luachon==3) {
						
					}else if(luachon==4) {
						
					}else if(luachon==5) {
						
					}else if(luachon==6) {
						
					}else if(luachon==7) {
						
					}else if(luachon==8) {
						
					}else if(luachon==9) {
						
					}else if(luachon==10) {
						
					}
		
		
		}while(luachon!=0);
}
}
