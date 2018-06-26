package ru.testdb;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3366/test"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {

        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Driver Error!");
        }

        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            System.out.println("Connection OK!");
                //statement.execute("insert into users (name, age, email) values('Alex', 33, 'ls@mail.ru');");
                //statement.executeUpdate("UPDATE `users` SET `name`='aaaaa',`age`=100,`email`='wwww@wwww' WHERE name = 'ggg';");
                //ResultSet res = statement.executeQuery("SELECT * FROM 'users' WHERE id=1");
                //statement.addBatch("INSERT INTO users (name) values ('ffffrrrryyyyy')";
                //statement.addBatch("INSERT INTO users (name, age, email) VALUES ('Big', 18, 'qwerty@mail.ru');");
                //statement.addBatch("INSERT INTO users (name, email) VALUES ('Dic', 'dic@mail.ru');");
                //statement.addBatch("INSERT INTO articles (auhtor, name_article) values ('ffff', 'yyyyyy';)");
                //statement.addBatch("INSERT INTO articles (auhtor, name_article) values ('cccc', 'rttttr';)");
                //statement.addBatch("INSERT INTO articles (auhtor, name_article) values ('vvvvvv', 'rhhhhr';)");
                //statement.executeBatch();
                statement.clearBatch(); // очищает Batch
                System.out.println("Entry added!");
                //System.out.println(res);
                if (!connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed!");


                }
                statement.getConnection(); // соединение с базой

                 statement.close(); // закрыть соединение

        } catch (SQLException e) {
            System.out.println("Connection Error!");
        }




//        Connection connection;
//
//        try {
//            Driver driver = new Driver();
//            DriverManager.registerDriver(driver);
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Connection is OK!");
//            if (!connection.isClosed()) {
//                connection.close();
//                System.out.println("Connection closed!");
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Connection Error!");
//        }

    }
}
