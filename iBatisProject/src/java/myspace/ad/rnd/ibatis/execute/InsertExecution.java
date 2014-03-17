/**
 * 
 */
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
 * Example class for Insert query execution using iBatis.
 * 
 * @author Abhijeet Dalal
 */
public class InsertExecution {
    public static void main(String[] args) throws IOException, SQLException {
	// Get iBatis configuration file as stream.
	InputStream inputStream = InsertExecution.class
		.getResourceAsStream("resources/SqlMapConfig.xml");

	// Convert the stream into Reader.
	Reader rd = new InputStreamReader(inputStream);

	SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	System.out.println("Insert record in Database.....");

	// Create a new Employee object to insert to Database.
	Employee em = new Employee("Ashita", "Dalal", 5000);

	// Main statement that will push your record into Database.
	// This statement will search for 'Employee' name space in the
	// Employee.xml file and then will search for the id 'insert'.
	smc.insert("Employee.insert", em);

	System.out.println("Record inserted successfully!");

    }
}
