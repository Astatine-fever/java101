package Chapter15_JDBC;

import java.sql.*;

class Getting_result {
	public static void main(String args[]) throws Exception {
		// This is to check whether the database is connected... using try catch
		try // This will try the statements
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?allowMultiQueries=true", "root",
					"");

			System.out.println(" Database Details ");
			System.out.println(" ________________ ");

			String t2 = con.getMetaData().getURL();

			System.out.println("Database URL :" + t2);
			String t3 = con.getMetaData().getUserName();

			System.out.println("Database URL :" + t2);

			String t4 = con.getMetaData().getDriverName();
			System.out.println("Database Drivername :" + t4);

			System.out.println("Database Username :" + t3);
			boolean b1 = con.getMetaData().isReadOnly();

			System.out.println("Database Read Only :" + b1);

			System.out.println(" ________________ \n");

			Class.forName("com.mysql.cj.jdbc.Driver");

			PreparedStatement ps0;
			ps0 = con.prepareStatement("use rsn;");
			ps0.executeUpdate();
			System.out.println("Database selected");

			ps0 = con.prepareStatement("Select * from sample_table;");
			ps0.executeQuery();
			System.out.println("Table Selected");

			ResultSet rs = ps0.executeQuery();
			while (rs.next())// rs.next is used to get values continously till last row
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		}

		catch (Exception e) // This will catch any exception during try session
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}