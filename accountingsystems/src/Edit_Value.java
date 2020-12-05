import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Edit_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        connectionToDB obj_connectionToDB = new connectionToDB();
        connection = obj_connectionToDB.get_connection();

        try {
            String users = "update users";
            statement = connection.createStatement();
            statement.executeUpdate(users);
            System.out.println("Обновление прошло успешно");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
