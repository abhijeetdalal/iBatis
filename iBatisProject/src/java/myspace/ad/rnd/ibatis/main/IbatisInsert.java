/**
 * 
 */
package myspace.ad.rnd.ibatis.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * @author Abhijeet Dalal
 * 
 */
public class IbatisInsert {
    public static void main(String[] args) throws IOException, SQLException {
	InputStream inputStream = IbatisInsert.class
		.getResourceAsStream("resources/SqlMapConfig.xml");

	Reader rd = new InputStreamReader(inputStream);
	// Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

	/* This would insert one record in Employee table. */
	System.out.println("Going to insert record.....");
	Employee em = new Employee("Ashita", "Dalal", 5000);

	smc.insert("Employee.insert", em);

	System.out.println("Record Inserted Successfully ");

    }
}
