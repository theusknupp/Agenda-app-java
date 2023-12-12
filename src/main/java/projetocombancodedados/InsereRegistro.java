package projetocombancodedados;

import Program.Agenda_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.cadastro.Contatos;

public class InsereRegistro {

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

    public void insertRecords(String nome,String email, String telefone) {
        connect();
        try {
            String query = "INSERT INTO tbagenda (nome, email, telefone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Inserir o primeiro registro
            preparedStatement.setString(1, "" + nome);
            preparedStatement.setString(2, "" + email);
            preparedStatement.setString(3, "" + telefone);
            preparedStatement.executeUpdate();
            System.out.println("Registros inseridos com sucesso na tabela tbAgenda.");
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao inserir registros: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }
     public void removeRecords(String textoSelecionado) {
        connect();
        try {
            String query = "DELETE FROM tbagenda WHERE Nome = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "" +textoSelecionado);
            preparedStatement.executeUpdate();
            System.out.println("Registros deletados com sucesso na tabela tbAgenda.");
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao inserir registros: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }
     
     public void showRecords() {
        connect();
        try {
            String query = "SELECT Nome, Email, Telefone FROM tbagenda;"; //Selecionando nome email e telefone da tabela
            PreparedStatement preparedStatement = connection.prepareStatement(query); //
            ResultSet rs = preparedStatement.executeQuery(); //Executa a consulta SQL e retorna o objeto ResultSet, resultados da consulta.
            System.out.println("Mostrando Registros:.");
            while (rs.next()) { //O metodo next é para percorrer as linhas do conjunto de resultados, o loop continua enquanto houver linhas.
            String nome = rs.getString("Nome");
            String email = rs.getString("Email");
            String telefone = rs.getString("Telefone");
            JOptionPane.showMessageDialog(null,  "" +nome+"\n "+email+ "\n" +telefone);
            }
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao mostrar registros: " + e.getMessage());
        } finally {
            closeConnection();
        }
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
        InsereRegistro ir = new InsereRegistro();
    }
}
