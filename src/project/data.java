/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import java.util.*;

/**
 *
 * @author adity
 */
public class data {
    
//    private static final String USER="adi";
//    private static final String PSWD="aditya1506";
//    private static final String URL="jdbc:mysql://65.0.230.205/information_schema";
    private Connection con;
    //Statement statement;
    
    public data(){
        //Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:library.db");
            System.out.println("connected to DB");
            //statement=con.createStatement();
        } catch (Exception e) {
            System.out.println("connection error: "+e.getMessage());
        }
    }
    
    public void createUsersTable() throws Exception {
        String query="CREATE TABLE IF NOT EXISTS users(\n"
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + "username text NOT NULL UNIQUE,\n"
                + "password varchar(50) NOT NULL,\n"
                + "name varchar(50) NOT NULL);";
        
        con.createStatement().execute(query);
    }
    
    public void createBooksTable() throws Exception {
        String query="CREATE TABLE IF NOT EXISTS books(\n"
                + "book_name text NOT NULL,\n"
                + "category text NOT NULL,\n"
                + "uid INTEGER);";
        
        con.createStatement().execute(query);
    }
    
    /**
     * 
     * @return ResultSet contains all records in books table
     * @throws Exception SQLException
     */
    public List<Object[]> getAllBooks() throws Exception{
        String query = "SELECT * FROM books WHERE uid='"+User.id+"';";
        List<Object[]> list = new ArrayList<>();
        
        ResultSet rs;
        try (Statement st = con.createStatement()) {
            rs = st.executeQuery(query);
            while(rs.next()){
                String bookName = rs.getString("book_name");
                String category = rs.getString("category");
                Object ob[] = {bookName, category};
                list.add(ob);
            }
        }
        rs.close();
        
        return list;
    }
    
    /**
     * 
     * @param query
     * @return resultSet of query
     * @throws Exception 
     */
    public ResultSet newQuery(String query) throws Exception{
        return con.createStatement().executeQuery(query);
    }
    
    public int newUpdateQuery(String query) throws Exception{
        return con.createStatement().executeUpdate(query);
    }
    
    /**
     * insert data into books table 
     * @param bookName
     * @param category
     * @return inserted successfully?
     */
    public boolean insertBook(String bookName, String category){
        try {
            String query = "INSERT INTO books VALUES('"+bookName+"', '"+category+"', '"+User.id+"')";
            con.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            System.out.println("Insertion Error: "+e.getMessage());
            return false;
        }
    }
    
    /**
     * delete books corresponding to my user id
     * @return deleted successfully?
     */
    public boolean deleteMyBooks(){
        try {
            String query = "DELETE FROM books WHERE uid='"+User.id+"'";
            con.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            System.out.println("Delete Error: "+e.getMessage());
            return false;
        }
    }
    
    public boolean deleteBook(String bookName){
        try {
            String query = "DELETE FROM books WHERE book_name='"+bookName+"' AND uid='"+User.id+"' ;";
            con.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            System.out.println("Delete error: "+e.getMessage());
            return false;
        }
    }
    
    public void closeConnection(){
        try {
            con.close();
            System.out.println("connection closed");
        } catch (Exception e) {
            System.out.println("connection closing error: "+e.getMessage());
        }
    }
    
    public int getTotalBooksCount() throws Exception{
        String countBooksQuery="SELECT COUNT(*) FROM books WHERE uid='"+User.id+"';";
        ResultSet rs= con.createStatement().executeQuery(countBooksQuery);
        return rs.getInt(1);
    }
    
    public int getTotalBooksCount(String category) throws Exception{
        String countBooksQuery="SELECT COUNT(*) FROM books; WHERE category='"+category+"' AND uid='"+User.id+"' ;";
        ResultSet rs= con.createStatement().executeQuery(countBooksQuery);
        return rs.getInt(1);
    }
    
    
    /**
     * check whether login credentials are correct
     * @param username username entered by user
     * @param password password entered by user
     * @return login credentials match or not
     * @throws Exception SQLException
     */
    public boolean login(String username, String password) throws Exception{
        String loginQuery = "SELECT COUNT(*) as user_count FROM users "
                + "WHERE username='"+username+"' AND password='"+password+"' ;";
        
        ResultSet rs = con.createStatement().executeQuery(loginQuery);
        if(rs.getInt("user_count")==1){
            getCurUser(username, password);
            return true;
        }
        return false;
        //System.out.println("metadata="+rs.getMetaData().getColumnCount());
        /*String db_username = rs.getString("username");
        String db_pswd = rs.getString("password");
        rs.close();
        
        return db_username.equals(username) && db_pswd.equals(password); */
    }
    
    private void getCurUser(String username, String password){
        try {
            String findUserQuery = "SELECT * FROM users "
                    + "WHERE username='"+username+"' AND password='"+password+"' ;";
            
            ResultSet rs = con.createStatement().executeQuery(findUserQuery);
            User.initialize(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("name")
            );
            System.out.println("initialized");
            
        } catch (SQLException ex) {
            System.out.println("Error in getUser: "+ex.getMessage());
        }
        
    }
    
    public ResultSet connect(String sql) throws Exception{
        Statement st=con.createStatement();
        return st.executeQuery(sql);
    }
    
    
}
