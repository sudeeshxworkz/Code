package com.xworkz.jdbcapplication.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmartRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Found");
            String url = "jdbc:mysql://localhost:3306/dmart";
            String userName = "root";
            String password = "4693";
           Connection connection =  DriverManager.getConnection(url,userName,password);
            System.out.println("Establish connection successfully");
            String insert1 = "insert into dmart_info values(0,'Tropicana',120.00)";
            String insert2 = "insert into dmart_info values(0,'Lamp',1010.00)";
            String insert3 = "insert into dmart_info values(0,'Water',10.00)";
            String insert4 = "insert into dmart_info values(0,'Juice',90.00)";
            String insert5 = "insert into dmart_info values(0,'butter',103.00)";
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


