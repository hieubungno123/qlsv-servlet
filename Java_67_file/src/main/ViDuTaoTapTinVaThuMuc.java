package main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class ViDuTaoTapTinVaThuMuc {
public static void main(String[] args) {
	//Luu y:
	//MS WINDOWS : \ => \\  ViD: "C:\\Thu Muc 1\\Thu Muc\\Ten tap tin.xxx"
	
	//Kiem tra thu muc xem ton tai hay khong ?
	File folder1 = new File("C:\\Users\\hieub\\eclipse-workspace\\Java_67_file");
	File folder2 = new File("C:\\Users\\hieub\\eclipse-workspace\\Java_68_file");
	System.out.println("Kiem tra folder1 co ton tai hay ko: " + folder1.exists());
	System.out.println("Kiem tra folder2 co ton tai hay ko: " + folder2.exists());

	//Tao thu muc
	//Phuong thuc mkdir()
	File d1 = new File("C:\\Users\\hieub\\eclipse-workspace\\Java_67_file\\Directory_2");
	//d2.mkdir();
	d1.mkdir();
	
	//Phong thuc mkdirs() => Tao nhieu thu muc cung luc
	File d2 = new File("C:\\\\Users\\\\hieub\\\\eclipse-workspace\\\\Java_67_file\\\\Directory_3\\\\\\\\Directory_4\\\\\\\\Directory_5\\\\\\\\Directory_6");
	d2.mkdirs();
	
	//Tao tap tin (Co phan mo rong: .exe , .txt, .doc, ...)
	File file1 = new File("C:\\\\Users\\\\hieub\\\\eclipse-workspace\\\\Java_67_file\\\\Directory_2\\\\Vidu1.txt");
	try {
		file1.createNewFile();
	} catch (IOException e) {
		//Khong co quyen tao ra tap tin
		e.printStackTrace();
	}		
	}
}
