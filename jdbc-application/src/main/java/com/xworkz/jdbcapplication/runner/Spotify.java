package com.xworkz.jdbcapplication.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Spotify {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Found");
            String url = "jdbc:mysql://localhost:3306/spotify";
            String userName = "root";
            String password = "4693";
           Connection connection =  DriverManager.getConnection(url,userName,password);
            System.out.println("Establish connection successfully");
            String insert1 = "insert into spotify_info values(0,'Lonely','theweeknd')";
            String insert2 = "insert into spotify_info values(0,'starboy','theweeknd')";
            String insert3 = "insert into spotify_info values(0,'timeless','theweeknd')";
            String insert4 = "insert into spotify_info values(0,'saopaulo','theweeknd')";
            String insert5 = "insert into spotify_info values(0,'kpop','theweeknd')";

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


