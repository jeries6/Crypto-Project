import java.sql.*;

public class DbConnection {

    public Connection getCon()
    {
        		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crypto?serverTimezone=AST", "root", "MyNewPass");
			return con;
/*			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();*/
		} catch (Exception e) {
			System.out.println(e);
		}
        		return null;
    }

    public ResultSet excuteQueryy(Connection con, String query){

		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		} catch (SQLException e ) {
			System.out.println(e);
			try {
				con.close();
			}catch (SQLException err){
				System.out.println(err);
			}
		}
		return null;
	}

}
