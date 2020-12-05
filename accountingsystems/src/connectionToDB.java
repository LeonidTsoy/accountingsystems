import java.sql.DriverManager;
import java.sql.Connection;

public class connectionToDB {

    public static void main(String[] args) {
        connectionToDB obj_connectionToDB = new connectionToDB();
        System.out.println(obj_connectionToDB.get_connection());
    }

    public Connection get_connection() {
        String DB_URL = "jdbc:postgresql://localhost:8080/accountingsystem";
        String USER = "postgres";
        String PASS = "leonid";
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            if (connection != null) {
                System.out.println("Вы подключены к базе данных");
            } else {
                System.out.println("Не удалось подключиться к базе данных");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
