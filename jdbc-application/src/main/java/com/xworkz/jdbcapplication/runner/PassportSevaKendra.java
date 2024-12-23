package com.xworkz.jdbcapplication.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassportSevaKendra {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Found");
            String url = "jdbc:mysql://localhost:3306/passport";
            String userName = "root";
            String password = "4693";
         Connection connection =  DriverManager.getConnection(url,userName,password);
            System.out.println("Establish connection successfully");
            String insert1 = "insert into passport_info values(0,'Lax','BCA')";
            String insert2 = "insert into passport_info values(0,'Randy','BBA')";
            String insert3 = "insert into passport_info values(0,'JP','BA')";
            String insert4 = "insert into passport_info values(0,'canad','MCA')";
            String insert5 = "insert into passport_info values(0,'mahi','BCA')";

            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);

        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("Not found"+classNotFoundException);
        }

    }
}
