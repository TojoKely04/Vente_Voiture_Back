package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ilokely
 */

public class Co {
    public static Connection seConnecterPostgres(String utilisateur , String motdepasse,  String base) throws Exception
    {
        Class.forName("org.postgresql.Driver");
        String url ="jdbc:postgresql://localhost:5432/"+base;
        Connection con =DriverManager.getConnection(url, utilisateur, motdepasse);
        return con;
    }
    public static Connection getConnection() throws Exception{
        return Co.seConnecterPostgres("postgres", "1881", "voiture");
}
}
