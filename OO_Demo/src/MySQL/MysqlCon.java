package MySQL;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kirjasto", "root", "");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM KIRJAT");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}