package com.capgemini.contactfile.dto;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactfile.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	FileReader reader;
	Properties prop;
	ContactBean user;

	public void ContactDAOImlp() {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ContactBean> getAllContacts() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				user = new ContactBean();	
				
				user.setName(rs.getString(1));
				user.setNumber(rs.getInt(2));
				user.setGroup(rs.getString(3));
				list.add(user);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertContact(ContactBean user) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
			pstmt.setString(1, user.getName());
			pstmt.setInt(2,user.getNumber());
			pstmt.setString(3, user.getGroup());

			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateContact(ContactBean user) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setString(1, user.getName());

			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}		return false;
	}

	@Override
	public boolean deleteContact(ContactBean user) {
		
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setString(1, user.getName());
			
			int count = pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
}


	