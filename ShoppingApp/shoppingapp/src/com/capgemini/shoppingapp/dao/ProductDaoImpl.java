package com.capgemini.shoppingapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.shoppingapp.beans.Product;
import com.capgemini.shoppingapp.factory.ProductManager;

public class ProductDaoImpl implements ProductDao {


	FileReader reader;
	Properties prop;
	Product bean = ProductManager.getBean();
	Scanner sc = new Scanner(System.in);
	public ProductDaoImpl() {
		try {
			reader = new FileReader("product.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));


		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	@Override
	public List<Product> searchProduct(String name) {
		List<Product> l1 =  new ArrayList<Product>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt =  (PreparedStatement) conn.prepareStatement(prop.getProperty("searchQuery"))){
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			Product b =  new Product();
			while(rs.next()) {
				b.setProductId(rs.getInt(1));
				b.setProductName(rs.getString(2));
				b.setProductCost(rs.getDouble(3));
				b.setProductColor(rs.getString(4));
				b.setDescription(rs.getString(5));
				b.setNoOfProducts(rs.getInt(6));


			}
			l1.add(b);

			return l1;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}




	@Override
	public List<Product> getAllProduct() {
		List<Product> l1 =  new ArrayList<Product>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt =  (PreparedStatement) conn.prepareStatement(prop.getProperty("query1"))){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product b =  new Product();
				b.setProductId(rs.getInt(1));
				b.setProductName(rs.getString(2));
				b.setProductCost(rs.getDouble(3));
				b.setProductColor(rs.getString(4));
				b.setDescription(rs.getString(5));
				b.setNoOfProducts(rs.getInt(6));

				l1.add(b);

			}
			return l1;


		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}