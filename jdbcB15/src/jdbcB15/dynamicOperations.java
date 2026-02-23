package jdbcB15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dynamicOperations {
	
	public void saveEmployee(String name, String dept, long salary, String city) throws SQLException {
		
		Connection con=jdbcUtil.getConnection();
		
		
		try {
			PreparedStatement ptst=con.prepareStatement("insert into employee(name,dept,salary,city) values (?,?,?,?)");
			
			ptst.setString(1, name);
			ptst.setString(2, dept);
			ptst.setLong(3, salary);
			ptst.setString(4, city);
			int insertedRows=ptst.executeUpdate();
			System.out.println(insertedRows);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
public void updateEmployee(String name, String dept,long salary ) throws SQLException {
		
		Connection con=jdbcUtil.getConnection(); // long salary, String city     
		
		try {
			PreparedStatement ptst=con.prepareStatement("update employee set name=?,dept=?, salary=? where id=7");
			
			ptst.setString(1, name);
			ptst.setString(2, dept);
			ptst.setLong(3, salary);
			//ptst.setString(4, city);
			int updateRows=ptst.executeUpdate();
			System.out.println(updateRows);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
public void deleteEmployee(String city ) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); // ,     
	
	try {
		PreparedStatement ptst=con.prepareStatement("delete from  employee where city=?");
		
		//ptst.setString(1, name);
		//ptst.setString(2, dept);
		//ptst.setLong(3, salary);
		ptst.setString(1, city);
		int deleteRows=ptst.executeUpdate();
		System.out.println(deleteRows);
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}

public void deleteEmployee1(int id ) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); // ,     
	
	try {
		PreparedStatement ptst=con.prepareStatement("delete from  employee where id=?");
		
		//ptst.setString(1, name);
		//ptst.setString(2, dept);
		//ptst.setLong(3, salary);
		//ptst.setString(1, city);
		ptst.setInt(1, id);
		int deleteRows=ptst.executeUpdate();
		System.out.println(deleteRows);
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}

public void readEmployee( int id) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from  employee where id=?  ");
		 ptst.setInt(1, id);
		 ResultSet  rst=ptst.executeQuery();
		 while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}
public void readAllEmployee() throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from  employee  ");
		
		 ResultSet  rst=ptst.executeQuery();
		 while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}

public void AndEmployee ( String adept,String acity ) throws SQLException {
	
	Connection con=jdbcUtil.getConnection();      
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from employee where dept=? and city=? ");
		

		ptst.setString(1, adept);
		
		ptst.setString(2, acity);
		
		ResultSet rst=ptst.executeQuery();
		
		while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
	
}
public void OrEmployee ( String adept,String acity ) throws SQLException {
	
	Connection con=jdbcUtil.getConnection();      
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from employee where dept=? or city=? ");
		

		ptst.setString(1, adept);
		
		ptst.setString(2, acity);
		
		ResultSet rst=ptst.executeQuery();
		
		while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
	
}
public void BetweenEmployee ( long salary1 ,long salary2 ) throws SQLException {
	
	Connection con=jdbcUtil.getConnection();      
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from employee where salary between ? and ? ");
		

		ptst.setLong(1, salary1);
		ptst.setLong(2, salary2);

		ResultSet rst=ptst.executeQuery();
		
		while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
	
}


public void readbyDeptEmployee( String adept) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from  employee where dept=?  ");
		 ptst.setString(1, adept);
		 ResultSet  rst=ptst.executeQuery();
		 while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}

public void LikeEmployee( String aname) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try {
		PreparedStatement ptst=con.prepareStatement("select*from  employee where name like  ? ");
		 ptst.setString(1, aname);
		 
		 ResultSet  rst=ptst.executeQuery();
		 while(rst.next()) {
			 int eid=rst.getInt(1);
			 String name=rst.getString(2);
			 String dept=rst.getString(3);
				Long salary=rst.getLong(4);
				String city=rst.getString(5);
			 
				System.out.println("id :: "+eid+"   name::"+name+"   dept::"+dept+"   salary::"+salary+"   city::"+city);
				//System.out.println(rst);
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}
public void GroupbyEmployee( String dept) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try {
		PreparedStatement ptst=con.prepareStatement("select min(salary), max(salary),avg(salary), sum(salary),count(salary) from employee group by dept");
		
		// ptst.setString(1, dept);
		 
		 
		 ResultSet  rst=ptst.executeQuery();
		 
		 while(rst.next()) {
			
			 
			Long minsalary=rst.getLong(1);
			long maxsalary=rst.getLong(2);
			long avgsalary=rst.getLong(3);
			Long sumsalary=rst.getLong(4);
			long countsalary=rst.getLong(5);
		
				
		System.out.println(" min salary :::"+minsalary+"    max salary::"+maxsalary+"  avg salary ::"+avgsalary+"   sum salary ::"+sumsalary+"    count salary::"+countsalary);
				
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}
public void Groupby1Employee( String dept) throws SQLException {
	
	Connection con=jdbcUtil.getConnection(); 
	
	
	try { // Having for Group by
		PreparedStatement ptst=con.prepareStatement("select min(salary), max(salary),avg(salary), sum(salary),count(salary) from employee group by dept having dept=?");
		
		 ptst.setString(1, dept);
		 
		 
		 ResultSet  rst=ptst.executeQuery();
		 
		 while(rst.next()) {
			
			 
			Long minsalary=rst.getLong(1);
			long maxsalary=rst.getLong(2);
			long avgsalary=rst.getLong(3);
			Long sumsalary=rst.getLong(4);
			long countsalary=rst.getLong(5);
		
				
		System.out.println(" min salary :::"+minsalary+"    max salary::"+maxsalary+"  avg salary ::"+avgsalary+"   sum salary ::"+sumsalary+"    count salary::"+countsalary);
				
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
}

public void ASCDESCEmployee(String order ) throws SQLException {
	
	
	Connection con=jdbcUtil.getConnection(); 
	
	PreparedStatement ptst=null;
	try {
		if(order.equalsIgnoreCase("ASC")) {
		 ptst=con.prepareStatement("select distinct(salary) from employee order by salary ASC");
		}else {
			 ptst=con.prepareStatement("select distinct(salary) from employee order by salary DESC");
		}
		  
		 ResultSet  rst=ptst.executeQuery();
		 
		 while(rst.next()) {
			
			 
			Long salary=rst.getLong(1);
			
		System.out.println("salary order ::"+salary);
				
		//System.out.println(" min salary :::"+minsalary+"    max salary::"+maxsalary+"  avg salary ::"+avgsalary+"   sum salary ::"+sumsalary+"    count salary::"+countsalary);
				
			 
		 }
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		con.close();
	}
	
}

	public static void main(String[] args) throws SQLException {
		dynamicOperations dop=new dynamicOperations();
		//dop.saveEmployee("sarath", "python", 120000, "guntur");
		//dop.updateEmployee("RAJESH", "JAVA", 250000);
		//dop.deleteEmployee("vishwa");
		//dop.deleteEmployee1(2);
		//dop.readEmployee(4);
		//dop.readAllEmployee();
	//	dop.AndEmployee("java", "kerala");
		//dop.OrEmployee("java", "hyderbad");
		//dop.BetweenEmployee(100000, 160000);
		//dop.readbyDeptEmployee("java");
		//dop.LikeEmployee("%k%");
	//	dop.GroupbyEmployee("java");
		//dop.Groupby1Employee("java");
		//dop.ASCDESCEmployee("desc");
		
		
	}


}
