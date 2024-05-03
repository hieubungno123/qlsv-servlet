package user;

import java.util.Arrays;

import user.PersonReadBook;

public class BorrowBookManagement {
	private PersonReadBook personReadBook;
	private BookBorrowManagementDetail[] details;
	
	public BorrowBookManagement() {
		super();
	}

	public BorrowBookManagement(PersonReadBook personReadBook, BookBorrowManagementDetail[] details) {
		this.personReadBook = personReadBook;
		this.details = details;
	}

	public PersonReadBook getPersonReadBook() {
		return personReadBook;
	}

	public void setPersonReadBook(PersonReadBook personReadBook) {
		this.personReadBook = personReadBook;
	}

	public BookBorrowManagementDetail[] getDetails() {
		return details;
	}

	public void setDetails(BookBorrowManagementDetail[] details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "BorrowBookManagement [personReadBook=" + personReadBook + ", details=" + Arrays.toString(details) + "]";
	}
	
	
	
}	
