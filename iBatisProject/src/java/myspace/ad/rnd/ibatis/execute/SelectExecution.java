package myspace.ad.rnd.ibatis.execute;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLException;

import myspace.ad.rnd.ibatis.bean.Employee;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * Example class for Select query execution using iBatis.
 * 
 * @author Abhijeet Dalal
 */
public class SelectExecution {

    public static void main(String[] args) throws IOException, SQLException {
	// Get iBatis configuration file as stream.
	InputStream inputStream = InsertExecution.class
		.getResourceAsStream("../resources/SqlMapConfig.xml");

	// Convert the stream into Reader.
	Reader rd = new InputStreamReader(inputStream);

	SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	/* This would insert one record in Employee table. */
	System.out.println("Fetching record from Database...");

	// First name to be used as search criteria in the select query.
	String findWithFirstNameAs = "Ashita";

	// Main statement that will retrieve your record from Database.
	// This statement will search for 'Employee' name space in the
	// Employee.xml file and then will search for the id 'insert'.
	Employee employee = (Employee) smc.queryForObject("Employee.select",
		findWithFirstNameAs);

	System.out.println("********************************************");
	System.out.println("Employee Record Details:");
	System.out.println("ID: " + employee.getId());
	System.out.println("First Name: " + employee.getFirstName());
	System.out.println("Last Name: " + employee.getLastName());
	System.out.println("Salary: " + employee.getSalary());
	System.out.println("********************************************");

	System.out.println("Record fetched successfully!");

    }

}
