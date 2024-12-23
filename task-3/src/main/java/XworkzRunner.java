import java.sql.DriverManager;
import java.sql.SQLException;

public class XworkzRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Found");
            String url = "jdbc:mysql://localhost:3306/xworkz";
            String userName = "root";
            String password = "4693";
            DriverManager.getConnection(url,userName,password);
            System.out.println("Establish connection successfully");
        }catch (ClassNotFoundException | SQLException classNotFoundException){
            System.out.println("Not found:"+classNotFoundException);
        }

    }
}
