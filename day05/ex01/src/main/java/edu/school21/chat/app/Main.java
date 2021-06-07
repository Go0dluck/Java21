package edu.school21.chat.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/chat";
        String login = "postgres";
        String password = "";
        Connection con = getDBConnection(url, login, password);

        createTable(con);
        insertTable(con);
        closeConnection(con);
    }

    private static Connection getDBConnection(String url, String login, String password){
        Connection con = null;

        try {
            System.out.println("Registering JDBC driver...");
            Class.forName("org.postgresql.Driver").newInstance();
            System.out.println("JDBC driver OK !!!");
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("Where is your Postgres JDBC Driver?");
            e.printStackTrace();
            System.exit(-1);
        }
        try {
            System.out.println("Creating database connection...");
            con = DriverManager.getConnection(url, login, password);
            System.out.println("Connection OK !!!");
        } catch (SQLException throwables) {
            System.out.println("Connection FAIL: URL or LOGIN or PASSWORD !!!");
            throwables.printStackTrace();
            System.exit(-1);
        }
        return con;
    }
    private static void insertTable(Connection con){
        Scanner in = null;
        Statement statement = null;
        try {
            in = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/data.sql"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNextLine()){
            try {
                System.out.println("Insert table...");
                statement = con.createStatement();
                statement.execute(in.nextLine());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.exit(-1);
            }
        }
        try {
            assert statement != null;
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.exit(-1);
        }
    }
    private static void createTable(Connection con){
        Scanner in = null;
        Statement statement = null;

        try {
            in = new Scanner(new File(System.getProperty("user.dir") + "/src/main/resources/schema.sql"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        while (in.hasNextLine()){
            try {
                System.out.println("Created table...");
                statement = con.createStatement();
                statement.execute(in.nextLine());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.exit(-1);
            }
        }
        try {
            assert statement != null;
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.exit(-1);
        }
    }

    private static void closeConnection(Connection con){
        System.out.println("Closing connection and releasing resources...");
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.exit(-1);
            }
        }
        System.out.println("Connection close");
    }
}
