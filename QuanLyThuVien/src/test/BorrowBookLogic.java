package test;

import java.util.Scanner;

import user.Book;
import user.BookBorrowManagementDetail;
import user.BorrowBookManagement;
import user.PersonReadBook;

public class BorrowBookLogic {
	private BookLogic bookLogic;
	private ReaderLogic readerLogic;
	private BorrowBookManagement[] borrowBookManagement = new BorrowBookManagement[100];
	
	public BorrowBookLogic() {
		super();
	}

	public BorrowBookLogic(BookLogic bookLogic, ReaderLogic readerLogic) {
		this.bookLogic = bookLogic;
		this.readerLogic = readerLogic;
	}
	
	public BorrowBookManagement[] getBookManagement() {
		return borrowBookManagement;
	}
	
	public void showBorrow() {
		for(int i=0;i<borrowBookManagement.length;i++) {
			if(borrowBookManagement[i]!= null) {
				System.out.println(borrowBookManagement[i]);
			}
		}
	}
	
	 void borrowBook() {
		System.out.println("So bạn đọc cần mượn sách: ");
		int readerNumber = new Scanner(System.in).nextInt();
		for(int i=0;i<readerNumber;i++) {
			System.out.println("Nhap thông tin ban đọc thứ " + (i+1)+": ");
			PersonReadBook reader = inputReaderBorrow();
			
			BookBorrowManagementDetail[] details = inputBookBorrowManagementDetails();
			
			BorrowBookManagement borrowBookManagement = new BorrowBookManagement(reader, details);
			saveBorrow(borrowBookManagement);
		}
	}
	
	private BookBorrowManagementDetail[] inputBookBorrowManagementDetails() {
		System.out.println("Bạn muốn đọc bao nhiêu đầu sách: ");
		int bookNumber;
		do {
			bookNumber = new Scanner(System.in).nextInt();
			if(bookNumber>0 && bookNumber<6 ) {
				break;
			}
			System.out.println("Bạn đã mượn quá so luong cho phép" + bookNumber + "Vui lòng nhập lại");
		} while (true);
		
		BookBorrowManagementDetail[] details = new BookBorrowManagementDetail[bookNumber];
		int count=0;
		
		for(int j=0;j<bookNumber;j++) {
			System.out.println("Nhâp thông tin đầu sách thứ "+ (j+1)+": ");
			System.out.println("Nhạp mã id đầu sách");
			int bookID;
			Book book =null;			
			do {
				bookID=new Scanner(System.in).nextInt();
				book = bookLogic.searchBookID(bookID);
				if(book==null) {
					System.out.println("Không tồn tại, Vui lòng nhập lại");
				}
			} while (book!=null);
			
			System.out.println("Bạn muốn mượn sách " + book.getBookName()+" bao nhiêu cuốn: ");
			int quantity;
			
			do {
				quantity = new Scanner(System.in).nextInt();
				if(quantity>0 && quantity<4) {
					break;
				}
				System.out.println("Banj chi co the muon max 3 cuon Vui long nhap lai: ");
			} while (true);
			
			BookBorrowManagementDetail detail = new BookBorrowManagementDetail(book,quantity);
			details[count] = detail;
			count++;
		}
		return details;
	}
	
	private PersonReadBook inputReaderBorrow() {
		System.out.print("Mã bạn đọc muốn mượn sách: ");
		int readerID;
		PersonReadBook reader = null;

		do {
			readerID = new Scanner(System.in).nextInt();
			reader = readerLogic.searchReaderID(readerID);
			if(reader == null) {
				System.out.println("Không thấy mã id,"+readerID +"vui long nhập lại: ");
			}
		} while (reader!=null);
		return reader;
	}
	
	private void saveBorrow(BorrowBookManagement borrowBookManagement) {
		for(int i=0;i<this.borrowBookManagement.length;i++) {
			if(this.borrowBookManagement[i]==null) {
				this.borrowBookManagement[i]=borrowBookManagement;
				break;
			}
		}
	}
	
	
	
	

}
