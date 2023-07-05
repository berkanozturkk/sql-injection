import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class securedsql {


    private static void printUserData(String username, String password) throws ClassNotFoundException, SQLException {

        Connection con = DBconnection.getConnection();
        PreparedStatement prstmt = null;
        ResultSet rs = null;
        try{

            prstmt = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            prstmt.setString(1, username);
            prstmt.setString(2,password);
            System.out.println(prstmt);
            rs = prstmt.executeQuery();

            if (rs.next()) {
                System.out.println("id = " + rs.getInt("id") + " | username = "
                        + rs.getString("username") + " | password = " + rs.getString("password"));
                System.out.println("Login Succesful");
            }else{
                System.out.println("Login not correct");
            }
        }finally{
            if(rs != null) rs.close();
            prstmt.close();
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
