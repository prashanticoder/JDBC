package demo_jdbc;
import java.sql.*;

public class Demo {
	public static void main(String[] args) {
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver is loaded...");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        // Get an connection object ( create conn is a performance problem) =>
        // connection pool *

		Connection connection = null;

        try {
        	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl_batch6","root", "root");
            // We want to print all rec from emp2

 

            Statement stmt = connection.createStatement();
            // select RS //del/update/insert: n //can do both

 

            // stmt.executeQuery(sql) vs stmt.executeUpdate(sql) vs stmt.execute(sql)

 

            ResultSet rs = stmt.executeQuery("select * from employee");

 

            // id | name | salary | dept
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ":" + rs.getString("name") + ":" + rs.getString("city") + ":"
                        + rs.getString("desi"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
