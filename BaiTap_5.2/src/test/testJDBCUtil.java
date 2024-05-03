package test;

import java.sql.Connection;

import dataAccessObject.SachDAO;
import database.JDBCUtil;
import model.Sach;


public class testJDBCUtil {
	
	public static void main(String[] args) {
		Sach s2 = new Sach("dasdas", "fadasd", "dasdas", 50);
		SachDAO.getInstance().insert(s2);
	}
}
