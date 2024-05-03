package user;

import java.util.Scanner;

import statics.MajorBook;

public class Book implements InputInfor {
	private int auto_ID=10000;
	private int bookId;
	private String bookName;
	private String auther;
	private int publishingYear;
	private MajorBook majorBook;
		
	public Book( ) {
		this.bookId=this.auto_ID;
		auto_ID++;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public MajorBook getMajorBook() {
		return majorBook;
	}

	public void setMajorBook(MajorBook majorBook) {
		this.majorBook = majorBook;
	}

	@Override
	public void inputInfor() {
		System.out.print("Nhap tên sách: ");
		this.setBookName(new Scanner(System.in).nextLine());
		System.out.print("Nhap ten tác giả:");
		this.setAuther(new Scanner(System.in).nextLine());
		
		System.out.println("Nhập sách chuyên ngành");
		System.out.println("Chọn 1 trong các ngành sau:");
		System.out.println("1.Khoa học tự nhiên");
		System.out.println("2.Công nghệ thông tin");
		System.out.println("3.Văn học-Nghệ thuật");
		System.out.println("4.Điện tử viễn thông");
		int type = new Scanner(System.in).nextInt();
		switch (type) {
		case 1: {
			this.setMajorBook(MajorBook.NaturalScience);		
		}
		case 2: {
			this.setMajorBook(MajorBook.InformationTechnology);		
		}
		case 3: {
			this.setMajorBook(MajorBook.LiteratureArt);		
		}
		case 4: {
			this.setMajorBook(MajorBook.ElectronicTelecom);		
		}	
		}
		System.out.print("Nhập năm xuất bản:");
		this.setPublishingYear(new Scanner(System.in).nextInt());
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId +
				", bookName=" + bookName +
				", auther=" + auther + 
				", publishingYear="+ publishingYear + 
				", majorBook=" + majorBook + "]";
	}
	
	public void showBook() {
		System.out.print("Mã sach: " + this.bookId);
		System.out.print(", Tên sách: " + this.bookName);
		System.out.print(", Tên tác gia: " + this.auther);
		System.out.print(", Chuyên ngành: " + this.majorBook);
		System.out.print(", Năm xuất bản: " + this.publishingYear);
	}
	
	
	
	
	
}
