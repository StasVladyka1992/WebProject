package app.model;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Model {
    private static String user = "root";
    private static String password ="root";
    private static String URL = "jdbc:mysql://localhost:3306/users";
    private static Connection con;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, user, Model.password);
            if (!con.isClosed()){
                System.out.println("соединение установлено");
            }
        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }

    private Model(){
    }

    public static void add (String firstName, String lastName, String password, int age) {
        String query= null;
        try (Statement st = con.createStatement()) {
            if (password.equals(""))
                query = String.format("insert into users (firstName, lastName, age) values ('%s','%s','%d');", firstName, lastName, age);
            else
                query = String.format("insert into users (firstName, lastName, age, password) values ('%s','%s','%d','%s');", firstName, lastName, age, password);
            st.execute(query);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String list (){
        String query = "select id_user, firstName, lastName,age from users";
    return query;}

    public static Connection getConnection (){
        return con;
    }



}
