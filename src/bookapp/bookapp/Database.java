package bookapp;
/**
 * Store user books.
 * **/
import java.sql.*;
import java.sql.DriverManager;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/book";

    static final String USER = "root";
    static final String PASS = "root";

    public void connect() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to JDBC");
            String sql;
            sql = "SELECT isbn, title, author";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int isbn = rs.getInt("isbn");
                String title = rs.getString("title");
                String author = rs.getString("author");

                System.out.println("ISBN: "+ isbn);
                System.out.println("Title: "+ title);
                System.out.println("Author: "+ author);
            }

            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection closed successfully");
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(stmt!=null){
                    stmt.close();
                }
            }catch(SQLException se2){

            }try {
                if(conn!= null){
                    conn.close();
                }
            }catch(SQLException e2){
                e2.printStackTrace();
            }
        }
    }

}
