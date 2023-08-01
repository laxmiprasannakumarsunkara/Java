
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// Step 1:Load The Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully");
		//Step 2:Create The Connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "prasanna", "kumar");
		System.out.println("Connection Created Successfully"+" "+connection);
		//Step 3:Write The Query & Process The Query
		Statement statement = connection.createStatement();
		int x = statement.executeUpdate("create table emp(empid number,empname varchar2(20),empsal number)");
		System.out.println("Table Created Successfully"+" "+x);
		//Insert values
		int r1 = statement.executeUpdate("insert into  emp values(111,'sai',15000)");
		int r2 = statement.executeUpdate("insert into  emp values(112,'Prasanna',25000)");
		int r3 = statement.executeUpdate("insert into  emp values(113,'karthik',35000)");
		int r4 = statement.executeUpdate("insert into  emp values(114,'dileep',45000)");
		int r5 = statement.executeUpdate("insert into  emp values(115,'siva',55000)");
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		//update Table
		int count = statement.executeUpdate("update emp set empsal = empsal+5000 where empsal>35000");
		System.out.println("Record Updated"+" "+count);
		//Delete values in  Table
		int delcount = statement.executeUpdate("delete from emp where empsal<35000");
		System.out.println("Record Deleted"+" "+delcount);
		//Drop Table
		int drop = statement.executeUpdate("drop table emp");
		System.out.println("Table Dropped"+" "+drop);
		//Step-4:Release The Resource
		connection.close();
		System.out.println("Connection Closed");
		

	}

}
