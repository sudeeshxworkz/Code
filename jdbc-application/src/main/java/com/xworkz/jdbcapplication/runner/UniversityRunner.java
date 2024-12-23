package com.xworkz.jdbcapplication.runner;
import java.sql.*;
public class UniversityRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Found");
            String url = "jdbc:mysql://localhost:3306/university";
            String userName = "root";
            String password = "4693";
        Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Establish connection successfully");
            String insert1 = "insert into university_info values(0,'BU','PSIT')";
            String insert2 = "insert into university_info values(0,'MU','ALVAS')";
            String insert3 = "insert into university_info values(0,'DU','DELHI')";
            Statement statement = connection.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);

            int row[] = statement.executeBatch();
            System.out.println("No of row inserted " + row.length);
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("Not found"+classNotFoundException);
        }

    }
}
