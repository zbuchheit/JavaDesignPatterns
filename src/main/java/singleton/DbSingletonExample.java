package singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonExample {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement sql;
        try {
            sql = conn.createStatement();
            int count = sql
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20)," +
                            " City VARCHAR(20))");
            System.out.println("Table Created.");
            sql.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
    }
}
