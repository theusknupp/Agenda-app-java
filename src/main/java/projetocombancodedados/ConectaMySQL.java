package projetocombancodedados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
 
public class ConectaMySQL{
    private final String url = "jdbc:mysql://localhost:3306/bdagenda";
    private final String user = "root";
    private final String password = "";
    private Connection connection;
 
    public Connection connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexão bem-sucedida ao banco de dados!");
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao conectar-se ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
 
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }
 
    public static void main(String[] args) {
        ConectaMySQL mySQLConnection = new ConectaMySQL();
        Connection connection = mySQLConnection.connect();
        
        // Faça operações no banco de dados aqui
        // ...
        mySQLConnection.closeConnection();
    }
}
