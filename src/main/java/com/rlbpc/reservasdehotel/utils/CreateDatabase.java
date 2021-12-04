/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.reservasdehotel.utils;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
import java.sql.*;
public class CreateDatabase {
    private static final String NOTES_DB_DIR = System.getProperty("user.dir") + "/db/notesDB";
    private static final String CONNECTION_URL = "jdbc:h2:file:" + NOTES_DB_DIR;
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static void main(String [] args) throws SQLException, ClassNotFoundException {
	Class.forName("org.h2.Driver");
	Connection conn = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
	System.out.println("Notes db created");
	createTables(conn);		
	conn.close();
	}
    
    private static void createTables(Connection connection) throws SQLException {
	String DDL1 = "DROP TABLE IF EXISTS NOTE";
	String DDL2 = "CREATE TABLE NOTE (" +
			"id INT IDENTITY NOT NULL PRIMARY KEY, " +
			"name VARCHAR(50) NOT NULL, " +
			"text VARCHAR)";
		
	try(Statement stmnt = connection.createStatement()) {
            stmnt.executeUpdate(DDL1);
            stmnt.executeUpdate(DDL2);
            System.out.println("Note table created");
	}
    }
}

