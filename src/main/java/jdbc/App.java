package jdbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String ORACLE_JDBC_DRIVER_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String PROD_CONNECTION_STRING = "jdbc:oracle:thin:@laspdmcgdb01.dswh.ds.adp.com:1521:CG03";

	private static final String DIT_CONNECTION_STRING = "jdbc:oracle:thin:@ordddmgcgdb01.dslab.ad.adp.com:1521:CGDIT01";

	private static final String QUERY_PREFIX = "select inv.VIN, inv.WEB_ID, inv.status, inv.PRICE, inv.PRICE2 from inv.inventory inv where vin IN (";

	private static final String QUERY_SUFFIX = ") and inv.status='In-stock' and inv.WEB_ID like 'gmps-%'";

	private static final String FILENAME = "vin.txt";

	private static final String EXPORT_FILENAME = "vinExport.csv";

	private static String vinList[]=new String[62];

	public static void main( String[] args )
	{
		System.out.println("Satarted Process");
		getVehicleCustomData();

	}

	public static void getVehicleCustomData(){
		Connection con = null;
		boolean finalResult=false;
		int count=0;
		try{  
			//step1 load the driver class  
			Class.forName(ORACLE_JDBC_DRIVER_ORACLE_DRIVER);  

			//step2 create  the connection object  
			con=DriverManager.getConnection(  
					PROD_CONNECTION_STRING,"inv","inv");  

			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			System.out.println("DB connection stablished - "+stmt.toString());
			String resultString="";
			
			//step4 execute query
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(EXPORT_FILENAME))) {
			for(String str : getVinListFromFile()){
				ResultSet rs=stmt.executeQuery(QUERY_PREFIX + str + QUERY_SUFFIX);
				
				while(rs.next()){  
					 	bw.write(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+"\n");
				}
				System.out.print(count++ + " ");
			}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\n Done");
			
		}catch(Exception e){ System.out.println(e);} 
		finally {
			//step5 close the connection object  
			try {
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		System.out.println("Export completed  = ");

	}

	public static String[]  getVinListFromFile(){
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;
			int i = 0;
			int arrayParam=0;

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				
				i++;
				if(!(i%1000 == 0)){
					vinList[arrayParam] = ((vinList[arrayParam] != null) ? vinList[arrayParam]: "") + sCurrentLine  + "," ;
				}
				else{
					vinList[arrayParam] = ((vinList[arrayParam] != null) ? vinList[arrayParam]: "")+ sCurrentLine ;
					arrayParam++;
				}

			}
			System.out.println("Count of vinList ****** "+vinList.length);
			if(vinList[61].length()<vinList[1].length()){
				vinList[61] = vinList[61].substring(0, vinList[61].length()-1);
				
			}
			return vinList;

		} catch (IOException e) {
			e.printStackTrace();
			return new String[0];
		} 
	}


	public static void testConnection(){
		System.out.println("-------- Oracle JDBC Connection Testing ------");
		try {
			Class.forName(ORACLE_JDBC_DRIVER_ORACLE_DRIVER);

		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(
					DIT_CONNECTION_STRING, "inv", "inv");
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

}
