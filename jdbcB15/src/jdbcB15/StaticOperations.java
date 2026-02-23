package jdbcB15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOperations {

	public void saveEmployee() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb15", "root", "root");
			Statement stmt=con.createStatement();
			int insertedRows=stmt.executeUpdate("insert into employee(name,dept,salary,city) values ('Manjith','Java',175000,'hyderbad')");
			System.out.println("inserted rows ::"+insertedRows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}
	public void UpdateEmployee() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb15", "root", "root");
			Statement stmt=con.createStatement();
			int updateRows=stmt.executeUpdate("update employee set dept='aws' where id=5");
			System.out.println("update rows ::"+updateRows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
	
	public void DeleteEmployee() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb15", "root", "root");
			Statement stmt=con.createStatement();
			int deleteRows=stmt.executeUpdate("delete from employee where name='yesu'");
			System.out.println("delete rows ::"+deleteRows);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	public void getAllEmps() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcb15", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from employee");
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String dept=rs.getString(3);
				Long salary=rs.getLong(4);
				String city=rs.getString(5);
				
				System.out.println("id :: "+id+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
	
		
	}
	
	
	
public static void main(String[] args) {
	StaticOperations sop=new StaticOperations();
	//sop.saveEmployee();
	//sop.UpdateEmployee();
	//sop.DeleteEmployee();
	sop.getAllEmps();

}
}
