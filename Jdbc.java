import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jbdc.Driver");	
		
		Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/unisoft","root","root");
		System.out.println("connection created");
	}
}
