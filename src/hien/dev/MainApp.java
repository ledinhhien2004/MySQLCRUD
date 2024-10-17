package hien.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class MainApp {

	public static void main(String[] args) {

		Connection conn = getConnection();
		insert(conn);
//		CategoryImpl categoryImpl = new CategoryImpl(conn);
// 		UserImpl userImpl = new UserImpl(conn);
//		ProductImpl productImpl = new ProductImpl(conn);
// 		OrderImpl oderImpl = new OrderImpl(conn);
// 		OrderItemImpl oderItemImpl = new OrderItemImpl(conn);

//		categoryImpl.insert();
//		categoryImpl.update();
//		categoryImpl.delete();
//		categoryImpl.select();
//		userImpl.insert();
//		userImpl.update();
//		userImpl.delete();
//		userImpl.select();
//		userImpl.find(3);
//		productImpl.insert();
//		productImpl.update();
//		productImpl.delete();
//		productImpl.select();
//		orderImpl.insert();
//		orderImpl.update();
//		orderImpl.delete(4);
//      oderImpl.select();
//		orderImpl.find(3);
//      orderItemImpl.insert();MainApp.java
//      orderItemImpl.update();
//      orderItemImpl.delete(6);
//      oderItemImpl.select();
//      orderItemImpl.find(5);
	}

	private static void insert(Connection conn) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CATEGORIES(NAME, THUMBNAIL) VALUES (?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Ao Nam");
			stmt.setString(2, "http://image.com/1.jpg");

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Connection getConnection() {
		String DB_URL = "jdbc:mysql://localhost:3306/shop";
		String USER = "root";
		String PASS = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DB_URL, USER, PASS);
		}
		// ket noi voi CSDL MySQL
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
