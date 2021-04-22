package sdet_Training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {
	
    /*
     * CREATE TABLE emp( id varchar2(30) NOT NULL PRIMARY KEY, name varchar2(30) NOT
     * NULL, PhoneNumber varchar2(50) );
     */
     
     /*
     * I have written this code assuming that we have database access
     */
                                     
     public static void main(String[] args) {
                     insert();
                     update();
                     delete();
                     select();
     }

     private static Connection getConnection() {
                     Connection con = null;
                     try {
                                     Class.forName("oracle.jdbc.driver.OracleDriver");
                                     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "admin", "admin");
                                     if (con != null)
                                                     System.out.println("Connected");
                                     else
                                                     System.out.println("Not Connected");

                     } catch (Exception e) {
                                     System.out.println(e);
                     }
                     return con;
     }

     private static void insert() {
                     String name = "Test";
                     String phnNumber = "9988776655";
                     int id = 1;
                     try {
                                     Connection con = getConnection();
                                     Statement stmt = con.createStatement();

                                     String query = "insert into emp values(" + id + ", '" + name + "', '" + phnNumber + "')";
                                     int count = stmt.executeUpdate(query);

                                     id = 2;
                                     name = "Sample";
                                     phnNumber = "9977665511";
                                     query = "insert into emp values(" + id + ", '" + name + "', '" + phnNumber + "')";
                                     count = stmt.executeUpdate(query);
                                     if (count > 0)
                                                     System.out.println("Successfully Inserted");
                                     else
                                                     System.out.println("Insert Failed");
                     } catch (SQLException e) {
                                     e.printStackTrace();
                     }
     }

     private static void update() {
                     String newName = "Test1";
                     String newPhn = "9876543210";
                     int id = 1;
                     try {
                                     Connection con = getConnection();
                                     Statement stmt = con.createStatement();
                                     // Updating database
                                     String q1 = "UPDATE emp set name = '" + newName + "' PhoneNumber = '" + newPhn + "' WHERE id = '" + id
                                                                     + "'";
                                     int count = stmt.executeUpdate(q1);

                                     if (count > 0)
                                                     System.out.println("Password Successfully Updated");
                                     else
                                                     System.out.println("ERROR OCCURED :(");
                     } catch (SQLException e) {
                                     e.printStackTrace();
                     }
     }

     private static void delete() {
                     int id = 1;
                     try {
                                     Connection con = getConnection();
                                     Statement stmt = con.createStatement();
                                     String q1 = "DELETE from emp WHERE id = '" + id + "'";
                                     int count = stmt.executeUpdate(q1);
                                     if (count > 0)
                                                     System.out.println("One User Successfully Deleted");
                                     else
                                                     System.out.println("ERROR OCCURED :(");
                     } catch (SQLException e) {
                                     e.printStackTrace();
                     }
     }

     private static void select() {
                     int id = 2;
                     try {
                                     Connection con = getConnection();
                                     Statement stmt = con.createStatement();
                                     String q1 = "select * from emp WHERE id = '" + id + "'";
                                     ResultSet rs = stmt.executeQuery(q1);
                                     if (rs.next()) {
                                                     System.out.println("id : " + rs.getString(1));
                                                     System.out.println("Name : " + rs.getString(2));
                                                     System.out.println("Phone Number :" + rs.getString(3));
                                     } else {
                                                     System.out.println("No such user id is already registered");
                                     }
                     } catch (SQLException e) {
                                     e.printStackTrace();
                     }

     }


}
