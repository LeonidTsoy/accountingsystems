import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value {
    public String users() {
        Connection connection = null;
        Statement statement = null;
        connectionToDB obj_connectionToDB = new connectionToDB();
        connection = obj_connectionToDB.get_connection();

        try {
            String users = "insert into users(user_name,login) values('Alex','alex123')";
            statement = connection.createStatement();
            statement.executeUpdate(users);
            System.out.println("Операция прошла успешно");
        } catch (Exception e) {
            e.printStackTrace();

        }
        return users();
    }
}
