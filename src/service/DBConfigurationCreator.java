/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
import model.DatabaseConnectionProperty;

/**
 *
 * @author John Ferdinand Antonio
 */
public class DBConfigurationCreator {
    private final DatabaseConnectionProperty databaseConnectionProperty;
    
    public DBConfigurationCreator(DatabaseConnectionProperty databaseConnectionProperty){
        this.databaseConnectionProperty = databaseConnectionProperty;
    }
    
    //jdbc:mysql://localhost:3306/enrollmentdb
    //username
    //password
    
    private String getConnectionURL() {
        String jdbc = "jdbc";
        String mysql = "mysql";
        String ipAddress = databaseConnectionProperty.getIpAddress();
        String portNumber = databaseConnectionProperty.getPortNumber();
        String dbName = databaseConnectionProperty.getDatabaseName();

        StringBuilder sb = new StringBuilder();
        sb.append(jdbc);
        sb.append(":");
        sb.append(mysql);
        sb.append(":");
        sb.append("//");
        sb.append(ipAddress);
        sb.append(":");
        sb.append(portNumber);
        sb.append("/");
        sb.append(dbName);

        String connectionURL;
        connectionURL = sb.toString();

        return connectionURL;
    }
    
    public boolean create() {
        boolean isCreated = false;
        try {
            File f = new File(".\\src\\configuration\\dbConnection.cfg");
            Properties dbConfiguration = new Properties();
            dbConfiguration.setProperty("ConnectionURL", getConnectionURL());
            dbConfiguration.setProperty("username", databaseConnectionProperty.getUserName());
            dbConfiguration.setProperty("password", databaseConnectionProperty.getPassword());
            dbConfiguration.store(new FileOutputStream(f, true), "");

            System.out.println(getConnectionURL());
            isCreated = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isCreated;
    }
    
}
