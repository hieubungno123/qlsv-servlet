package test;

import java.util.Scanner;

import user.Person;
import user.PersonReadBook;

public class ReaderLogic {
	private PersonReadBook[] readers = new PersonReadBook[100];

	public PersonReadBook[] getPersonReadBooks() {
		return readers;
	}
	
	public void inputReader() {
		System.out.println("Nhap so lượng bạn đọc mới: ");
		int number = new Scanner(System.in).nextInt();
		for(int i=0;i<number;i++) {
			System.out.println("Bạn thứ "+(i+1)+": ");
			PersonReadBook reader = new PersonReadBook();
			reader.inputInfor();
			saveReader(reader);
		}
	}
	
	public void saveReader(PersonReadBook reader) {
		for(int i=0;i<this.readers.length;i++) {
			if(readers[i]==null) {
				readers[i] = reader;
				break;
			}
		}
	}
	
	public void outputReader() {
		for(int i=0;i<this.readers.length;i++) {
			if(readers[i]!= null) {
				System.out.println("Bạn đọc thứ " +(i+1)+": ");
				readers[i].showReader();
				System.out.println();
			}
		}
	}
	
	public PersonReadBook searchReaderID(int readerID) {
		for(int k=0;k<readers.length;k++) {
			if(readers[k]!=null && readers[k].getId()==readerID) {
				return readers[k];
			}
		}
		return null;
	}
	
	

}