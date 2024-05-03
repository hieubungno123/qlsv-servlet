package test;

import java.util.Scanner;

import user.Book;

public class BookLogic {
	private Book[] books = new Book[100];
	
	public  Book[] getBookLogics() {
		return books;
	}
	
	public void inputBook() {
		System.out.println("So lượng sách mới: ");
		int number = new Scanner(System.in).nextInt();
		for(int i=0;i<number;i++) {
			System.out.println("Nhập sách thứ: "+(i+1)+": ");
			Book book = new Book();
			book.inputInfor();
			saveBook(book);
		}
	}
	
	public void saveBook(Book book) {
		for(int i=0;i<this.books.length;i++) {
			if(books[i] == null) {
				books[i]= book;
				break;
			}
		}
	}
	
	public void outputBook() {
		for(int i=0;i<this.books.length;i++) {
			if(books[i]!=null) {
				System.out.print("Sách thứ " +(1+i)+": ");
				books[i].showBook();
				System.out.println();
			}
		}
	}
	
	public Book searchBookID(int bookID) {
		for(int k=0;k<books.length;k++) {
			if(books[k]!=null && books[k].getBookId()==bookID) {
				return books[k];
			}
		}
		return null;
	}
}
