package test.ad.rnd.main;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLException;

import test.ad.rnd.main.Employee;
import test.ad.rnd.main.IbatisInsert;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * @author Abhijeet Dalal
 */
public class IbatisSelect {

    public static void main(String[] args) throws IOException, SQLException {
	InputStream inputStream = IbatisInsert.class
		.getResourceAsStream("resources/SqlMapConfig.xml");

	Reader rd = new InputStreamReader(inputStream);
	// Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	/* This would insert one record in Employee table. */
	System.out.println("Going to fetch record.....");

	Employee employee = (Employee) smc.queryForObject("Employee.select");

	System.out.println("Emlpoyee Record Details:");
	System.out.println("ID: " + employee.getId());
	System.out.println("First Name: " + employee.getFirstName());
	System.out.println("Last Name: " + employee.getLastName());
	System.out.println("Salary: " + employee.getSalary());

	System.out.println("Record fetched Successfully ");

    }

}
