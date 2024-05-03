package user;

import user.Book;

public class BookBorrowManagementDetail {
	private Book book;
	private int quantity;
	
	public BookBorrowManagementDetail() {
		super();
	}
	
	

	public BookBorrowManagementDetail(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
	}

	


	@Override
	public String toString() {
		return "BookBorrowManagementDetail"
				+ " [book=" + book +
				", quantity=" + quantity + "]";
	}



	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
