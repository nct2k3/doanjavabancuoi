/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDatabase;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modun.account;
import modun.listFlower;
/**
 *
 * @author LAM
 */
public class ConnectToXampp {
    public static List<listFlower>findAll(){
        List<listFlower> listF = new ArrayList<>();
        Connection conn = null;
        Statement statement = null; 
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from flower";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                listFlower e = new listFlower(rs.getString("Name"), rs.getString("Code"), rs.getString("Type"), rs.getString("Color"), rs.getInt("Amount"), rs.getInt("petalsFlowerNum"), rs.getInt("subFlowerNum"), rs.getInt("day"), rs.getInt("month"), rs.getInt("year"));
                listF.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listF;
    }
    
    public static void delete(String Code){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "delete from flower where Code = ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, Code);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Error");
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }   
    public static void update(listFlower flower){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "update flower set Name=?, Type=?, Color=?, Amount=?, SubFlowerNum=?, PetalsFlowerNum=?, day=?, month=?, year=?  where Code=?";
            System.out.println("Conncect to success up!!");
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getName());
            statement.setString(2, flower.getType());
            statement.setString(3, flower.getColor());
            statement.setInt(4, (int) flower.getAmount());
            statement.setInt(5, (int) flower.getsubFlowerNum());
            statement.setInt(6, (int) flower.getpetalsFlowerNum());
            statement.setInt(7, (int) flower.getDay());
            statement.setInt(8, (int) flower.getMonth());
            statement.setInt(9, (int) flower.getYear());
            statement.setString(10, flower.getCode());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
    public static void insert(listFlower flower){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into flower(Code, Name, Type, Color, Amount, SubFlowerNum, PetalsFlowerNum, day, month, year) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getCode());
            statement.setString(2, flower.getName());
            statement.setString(3, flower.getType());
            statement.setString(4, flower.getColor());
            statement.setInt(5, (int) flower.getAmount());
            statement.setInt(6, (int) flower.getsubFlowerNum());
            statement.setInt(7, (int) flower.getpetalsFlowerNum());
            statement.setInt(8, (int) flower.getDay());
            statement.setInt(9, (int) flower.getMonth());
            statement.setInt(10, (int) flower.getYear());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
    public static List<account>findAllAccount(){
        List<account> listAccount = new ArrayList<>();
        Connection conn = null;
        Statement statement = null; 
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from accountuser";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                account e = new account(rs.getInt("Id"), rs.getString("Gmail"), rs.getString("Name"), rs.getString("Pass"));
                listAccount.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listAccount;
    }
    public static void updatePassOfAccount(account acc){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "update accountuser set Pass=? where Id = ? and Gmail = ? and Pass = ?";
            statement = conn.prepareStatement(sql);
            System.out.println("Conncect to success up!!");
            statement.setString(1, acc.getPass());
            statement.setInt(2, (int) acc.getId());
            statement.setString(3, acc.getGmail());
            statement.setString(4, acc.getName());
            statement.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
    
    
    public static List<listFlower>findAllImport(){
        List<listFlower> listF = new ArrayList<>();
        Connection conn = null;
        Statement statement = null; 
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from import";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                listFlower e = new listFlower(rs.getString("Name"), rs.getString("Code"), rs.getString("Type"), rs.getString("Color"), rs.getInt("Amount"), rs.getInt("petalsFlowerNum"), rs.getInt("subFlowerNum"), rs.getInt("day"), rs.getInt("month"), rs.getInt("year"));
                listF.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listF;
    }
    
    public static void insertImport(listFlower flower){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into import(Code, Name, Type, Color, Amount, SubFlowerNum, PetalsFlowerNum, day, month, year) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getCode());
            statement.setString(2, flower.getName());
            statement.setString(3, flower.getType());
            statement.setString(4, flower.getColor());
            statement.setInt(5, (int) flower.getAmount());
            statement.setInt(6, (int) flower.getsubFlowerNum());
            statement.setInt(7, (int) flower.getpetalsFlowerNum());
            statement.setInt(8, (int) flower.getDay());
            statement.setInt(9, (int) flower.getMonth());
            statement.setInt(10, (int) flower.getYear());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
    public static List<listFlower>findAllExport(){
        List<listFlower> listF = new ArrayList<>();
        Connection conn = null;
        Statement statement = null; 
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conncect to success!!");
            String sql = "select *from export";
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                listFlower e = new listFlower(rs.getString("Name"), rs.getString("Code"), rs.getString("Type"), rs.getString("Color"), rs.getInt("Amount"), rs.getInt("petalsFlowerNum"), rs.getInt("subFlowerNum"), rs.getInt("day"), rs.getInt("month"), rs.getInt("year"));
                listF.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally{
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
        return listF;
    }
    
    public static void insertExport(listFlower flower){
        Connection conn = null;
        PreparedStatement statement = null;
        String url = "jdbc:mysql://localhost:3306/test";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into export(Code, Name, Type, Color, Amount, SubFlowerNum, PetalsFlowerNum, day, month, year) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement = conn.prepareStatement(sql);
            statement.setString(1, flower.getCode());
            statement.setString(2, flower.getName());
            statement.setString(3, flower.getType());
            statement.setString(4, flower.getColor());
            statement.setInt(5, (int) flower.getAmount());
            statement.setInt(6, (int) flower.getsubFlowerNum());
            statement.setInt(7, (int) flower.getpetalsFlowerNum());
            statement.setInt(8, (int) flower.getDay());
            statement.setInt(9, (int) flower.getMonth());
            statement.setInt(10, (int) flower.getYear());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng statement");
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Chưa đóng conn");
                }
            }
        }
    }
}


