package model;

import java.sql.*;

public class ConexaoMySQL {
    public static String URL = "jdbc:mysql://localhost:3306/aprendi1v";
    public static String USER = "root";
    public static String PWD = "root";

    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public void OpenDatabase() {
        try {
            dbconn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectado com sucesso em: " + URL);
            sqlmgr = dbconn.createStatement();
        } catch (Exception Error){
            System.out.println("Error on connect: " + Error.getMessage());
        }
    }
}
