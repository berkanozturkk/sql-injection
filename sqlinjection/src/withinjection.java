
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class withinjection {


    private static void printUserData(String username, String password) throws ClassNotFoundException, SQLException {

        Connection con = DatabaseConn.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = null;
        try{

            String query = "SELECT * FROM users where username = '"+ username + "' and password = '" + password + "'";
            System.out.println(query);
            rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("id = " + rs.getInt("id") + " | username = "
                        + rs.getString("username") + " | password = " + rs.getString("password"));
                System.out.println("Login Succesful");
            }else{
                System.out.println("Login not correct");
            }
        }finally{
            if(rs != null) rs.close();
            stmt.close();
            con.close();

        }

    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //read user entered data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username:");
        String username = scanner.nextLine();
        System.out.println("Please enter password to get details:");
        String password = scanner.nextLine();
        printUserData(username, password);

    }
}
