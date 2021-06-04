package sample.pl.lublin.wsei.cwiczenia.java;

import sample.pl.lublin.wsei.java.cwiczenia.test.pl.lublin.wsei.java.cwiczenia.MyDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMyDB {
    public static void main(String[] args) {
        MyDB db = new MyDB("localhost", 3306, "mydb");
        db.setUser("root");
        db.setPassword("SickDaler1599");
        Connection conn = db.getConnection();
        if (conn != null)

            System.out.println("Połączenie z bazą danych nawiązane");
        db.closeConnection();
        System.out.println("Połączenie z bazą zakończone");
    }
}
