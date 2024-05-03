package user;

import java.util.Scanner;
import statics.ReaderType;


public class PersonReadBook extends Person {
	Scanner sc = new Scanner(System.in);
	
	private static int auto_id = 10000;
	private int id;
	private ReaderType readerType;
	
	public PersonReadBook() {
		this.id = auto_id;
		auto_id++;
	}

	public int getAuto_id() {
		return auto_id;
	}

	public void setAuto_id(int auto_id) {
		this.auto_id = auto_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReaderType getReaderType() {
		return readerType;
	}

	public void setReaderType(ReaderType readerType) {
		this.readerType = readerType;
	}

	@Override
	public String toString() {
		return "PersonReadBook" +
				" [auto_id=" + auto_id +
				", id=" + id + 
				", readerType=" + readerType + "]";
	}
	
	@Override
	public void inputInfor() {
		super.inputInfor();
		System.out.println("Nhap loai ban doc trong cac loai:");
		System.out.println("1.Sinh vien");
		System.out.println("2.Sinh Vien Cao Hoc");
		System.out.println("3.Giao vien");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			this.setReaderType(readerType.UNGRADUTE_STUDENT);
			break;
		case 2:
			this.setReaderType(readerType.GRADUTE_STUDENT);
			break;
		case 3:
			this.setReaderType(readerType.TEACHER);
			break;
		}
	}
	
	public void showReader() {
		System.out.println("Ten: " + fullName);
		System.out.println("ID: " + this.id);
		System.out.println("Doi tuong: " + this.readerType);
		System.out.println("Dia chi: " + address);
		System.out.println("Phone number: " + phoneNumber);
	}
}
