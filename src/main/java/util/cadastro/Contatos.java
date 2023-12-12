package util.cadastro;

import javax.swing.JOptionPane;

public class Contatos {

    private String nameField;
    private String telefoneField;
    private String emailField;

    public Contatos() {

    }

    public Contatos(String nameField, String telefoneField, String emailField) {
        this.nameField = nameField;
        this.telefoneField = telefoneField;
        this.emailField = emailField;
    }

    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        if (!nameField.matches("[a-zA-Z\\s]+$")) {
            JOptionPane.showMessageDialog(null,"Nome Invalido!", "Erro!", 2);
            this.nameField = null;
        } else {
        this.nameField = nameField;
        }
    }

    public String getTelefoneField() {
        return telefoneField;
    }

    public void setTelefoneField(String telefoneField) {
        if (!telefoneField.matches("[0-9\\s]+$") || telefoneField.length() > 9) {
            JOptionPane.showMessageDialog(null, "Telefone Invalido!", "Erro" , 2);
            this.telefoneField = null;
    }
        this.telefoneField = telefoneField;
    }

    public String getEmailField() {
        return emailField;
    }

    public void setEmailField(String emailField) {
        if (emailField.contains("@") && emailField.contains(".com") && emailField.length() < 1000) {
        this.emailField = emailField;
        } else {
            JOptionPane.showMessageDialog(null, "Email Invalido!", "Erro" , 2);
            this.emailField = null;
        }
    }

    @Override
    public String toString() {
        return "-------Contatos!-------\n"
                + "\nNome: "+ nameField 
                + "\nTelefone: " + telefoneField 
                + "\nEmail: " + emailField;
        
    }

    
}
