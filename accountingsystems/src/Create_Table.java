import java.sql.Connection;
import java.sql.Statement;

public class Create_Table {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        connectionToDB obj_connectionToDB = new connectionToDB();
        connection = obj_connectionToDB.get_connection();

        try {

            String users = "CREATE TABLE users (user_id serial PRIMARY KEY,user_name character varying(30),login character varying(20))";
            statement = connection.createStatement();
            statement.executeUpdate(users);
            System.out.println("успешно");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
