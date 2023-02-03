/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RKT
 */
public class ConnectionPostgresSQL {
    public static Connection getconnect() throws SQLException,ClassNotFoundException
    {
        Connection cn;
        Class.forName("org.postgresql.Driver");
        String db = "jdbc:postgresql://containers-us-west-99.railway.app:7052/railway";
        cn = DriverManager.getConnection(db,"postgres","giaftrLD0tN4XR8Vkg6E");
        return cn;
    }
}
