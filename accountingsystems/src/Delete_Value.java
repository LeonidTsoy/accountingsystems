import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        connectionToDB obj_connectionToDB = new connectionToDB();
        connection = obj_connectionToDB.get_connection();

        try {
            String users = "delete from users where user_id='1'";
            statement = connection.createStatement();
            statement.executeUpdate(users);
            System.out.println("Удаление прошло успешно");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
