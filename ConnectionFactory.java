package demo_jdbc.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class ConnectionFactory {
	private static Connection connection=null;
	private ConnectionFactory() {}
	public static Connection getConnection() {
		InputStream in =ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
		Properties properties=new Properties();
		try {
			properties.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String driver=properties.getProperty("db.driver");
		 String url=properties.getProperty("db.url");
		 String username=properties.getProperty("db.username");
		 String password=(String) properties.setProperty("password", "");
		
		
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		try {
		connection=DriverManager.getConnection(url,username,password);
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return connection;
		
	}
}
