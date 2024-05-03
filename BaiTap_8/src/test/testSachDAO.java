package test;

import java.util.ArrayList;

import dataAccessObject.SachDAO;
import model.Sach;

public class testSachDAO {
	public static void main(String[] args) {
//		//Sach s1 = new Sach("ltjv", "Lap Trinh Java", 50000, 25);
//		Sach s2 = new Sach("LTC", "lAP TRINH C", 70000, 50);
//		
//		
////		SachDAO.getInstance().insert(s1);
//		
//		for(int i=0;i<=1000;i++) {
//			Sach s1 = new Sach("LT"+i, "Lap Trinh C", 2000, 2015);
//			SachDAO.getInstance().insert(s1);
//		}
		
/*		ArrayList<Sach> list = SachDAO.getInstance().selectAll();	
		for(Sach sach : list) {
		System.out.println(sach.toString());*/
		

//		Sach find = new Sach(); 
//		find.setId("LTC"); 
//		Sach sach2 = SachDAO.getInstance().selectById(find);
//		System.out.println(sach2);
 
		ArrayList<Sach> list = SachDAO.getInstance().selectByCondition("giaBan>10000");	
		for(Sach sach : list) {
		System.out.println(sach.toString());
		}
			
//		for(int i=0;i<=1000;i++) {
//			Sach s1 = new Sach("LT"+i, "Lap Trinh C", 2000, 2015);
//			SachDAO.getInstance().update(s1);
//		}
		
//		for(int i=0;i<=1000;i++) {
//		Sach s1 = new Sach("LT"+i, "Lap Trinh C", 2000, 2015);
//		SachDAO.getInstance().delete(s1);
	}
}
		
		
		
		
		
		
	

