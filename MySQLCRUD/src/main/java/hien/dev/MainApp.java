package hien.dev;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;

import data.CategoryImpl;
import data.OrderImpl;
import data.OrderItemImpl;
import data.ProductImpl;
import data.UserImpl;

/**
 *
 * @author Admin
 */
public class MainApp {
    
    public static void main(String[] args){
        
        Connection conn = getConnection();
        CategoryImpl categoryImpl = new CategoryImpl(conn);
        UserImpl userImpl = new UserImpl(conn);
        ProductImpl productImpl = new ProductImpl(conn);
        OrderImpl oderImpl = new OrderImpl(conn);
        OrderItemImpl oderItemImpl = new OrderItemImpl(conn);
        
//	categoryImpl.insert();
//	categoryImpl.update();
//	categoryImpl.delete();
	categoryImpl.select();
//	userImpl.insert();
//	userImpl.update();
//	userImpl.delete();
	userImpl.select();
//	userImpl.find(3);
//	productImpl.insert();
//	productImpl.update();
//	productImpl.delete();
	productImpl.select();
//	orderImpl.insert();
//	orderImpl.update();
//	orderImpl.delete(4);
        oderImpl.select();
//	orderImpl.find(3);
//      orderItemImpl.insert();
//      orderItemImpl.update();
//      orderItemImpl.delete(6);
        oderItemImpl.select();
//      orderItemImpl.find(5);
    }
    private static Connection getConnection(){
        String DB_URL = "JDBC.mysql://localhost:3306/shop";
        String DB_USER = "root";
        String DB_PASS = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }
        //ket noi voi CSDL MySQL
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
