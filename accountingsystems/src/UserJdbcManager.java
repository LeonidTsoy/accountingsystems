import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserJdbcManager {

    public ArrayList users(){
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        connectionToDB obj_connectionToDB = new connectionToDB();
        connection = obj_connectionToDB.get_connection();
        ArrayList<String> usersname = new ArrayList<>();
        try {
            String users = "select * from users";
            statement = connection.createStatement();
            rs = statement.executeQuery(users);
            while(rs.next()){
                usersname.add(rs.getString("user_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersname;
    }
}
