package BBDD;

import java.sql.*;

public class MysqlConexion {
    public static void main(String[] args) {
        //jdbc:mysql://localhost:33060/?user=root
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:33060/inmobiliaria","root","davo");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from empleados");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " +
                        rs.getString(2) + " " + rs.getString(3)
                        + " " + rs.getString(4) + " " + rs.getInt(5));
            }
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}