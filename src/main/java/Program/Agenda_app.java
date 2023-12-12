package Program;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.cadastro.Contatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ComboBoxEditor;
import projetocombancodedados.InsereRegistro;
import util.cadastro.Contatos;

public class Agenda_app extends javax.swing.JFrame {

    public Agenda_app() {
        initComponents();
    }

    String Nome;
    String Telefone;
    String Email;

    @SuppressWarnings("unchecked")
    ArrayList<String> list = new ArrayList<String>(); // Array para salvar os nomes dos contatos e colocar no combobox
    ArrayList<Contatos> CList = new ArrayList<Contatos>(); // Array para salvar todos dados dos contatos
    InsereRegistro IR = new InsereRegistro();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        telefoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addButon = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        ListaContatos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda 2023");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(483, 276));
        setPreferredSize(new java.awt.Dimension(483, 276));
        setResizable(false);
        setSize(new java.awt.Dimension(483, 360));
        getContentPane().setLayout(null);

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setText("Nome:");
        getContentPane().add(txtName);
        txtName.setBounds(106, 77, 40, 16);

        txtTelefone.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.setText("Telefone:");
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(86, 118, 60, 16);

        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Email:");
        getContentPane().add(txtEmail);
        txtEmail.setBounds(106, 158, 40, 16);

        nameField.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        nameField.setMinimumSize(new java.awt.Dimension(64, 25));
        nameField.setPreferredSize(new java.awt.Dimension(64, 25));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameField);
        nameField.setBounds(177, 72, 150, 30);

        telefoneField.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        telefoneField.setMinimumSize(new java.awt.Dimension(64, 25));
        telefoneField.setPreferredSize(new java.awt.Dimension(64, 25));
        telefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneFieldActionPerformed(evt);
            }
        });
        getContentPane().add(telefoneField);
        telefoneField.setBounds(177, 112, 150, 30);

        emailField.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)));
        emailField.setMinimumSize(new java.awt.Dimension(64, 25));
        emailField.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(emailField);
        emailField.setBounds(177, 152, 150, 30);

        addButon.setText("Adicionar");
        addButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButonActionPerformed(evt);
            }
        });
        getContentPane().add(addButon);
        addButon.setBounds(151, 192, 81, 23);

        removeButton.setText("Remover");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(271, 233, 90, 23);

        ListaContatos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListaContatosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListaContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaContatosActionPerformed(evt);
            }
        });
        getContentPane().add(ListaContatos);
        ListaContatos.setBounds(95, 233, 137, 22);

        jButton1.setText("Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(271, 192, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\OneDrive\\Documentos\\NetBeansProjects\\Agenda_app\\src\\main\\java\\util\\cadastro\\Sem título.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(175, 10, 153, 48);

        ImgFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\mathe\\OneDrive\\Documentos\\NetBeansProjects\\Agenda_app\\src\\main\\java\\util\\cadastro\\fotos-@estudiog19-coloque-os-creditos-de-imagem-nas-postagens-do-feed-71-Copia-600x800.jpg")); // NOI18N
        getContentPane().add(ImgFundo);
        ImgFundo.setBounds(0, -360, 1020, 770);

        setSize(new java.awt.Dimension(483, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneFieldActionPerformed

    }//GEN-LAST:event_telefoneFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void addButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButonActionPerformed
        Contatos c = new Contatos();
        c.setNameField(nameField.getText());
        c.setEmailField(emailField.getText());
        c.setTelefoneField(telefoneField.getText());
        String Nome = nameField.getText();
        String Telefone = telefoneField.getText();
        String Email = nameField.getText();

        if (c.getNameField() != null && c.getEmailField() != null && c.getTelefoneField() != null) { //Somente executa o codigo, caso o nameField seja diferente de null !
            CList.add(c); // Adicionando ao array list de contatos o nome, email e telefone.
            list.add(c.getNameField()); //Adiciona ao array list de string nomes, o nome armazenado no objeto contatos.
            ListaContatos.removeAllItems(); //Remove todos os itens do combo box
            IR.insertRecords(c.getNameField(), c.getEmailField(), c.getTelefoneField());
            for (String f : list) {
                ListaContatos.addItem(f); //Adiciona ao combo box o item f, isto é, o nome que esta no array.
            }
        }
        nameField.setText("");
        emailField.setText("");
        telefoneField.setText("");
    }//GEN-LAST:event_addButonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int NomeSelecionado = ListaContatos.getSelectedIndex();
        ListaContatos.removeItemAt(NomeSelecionado);
        list.remove(NomeSelecionado);
        CList.remove(NomeSelecionado);
        if (NomeSelecionado != -1) { // Certifica-se de que um item está selecionado
            String textoSelecionado = ListaContatos.getEditor().getItem().toString();
            JOptionPane.showMessageDialog(null, "Você removeu: " + textoSelecionado);
            IR.removeRecords(textoSelecionado);
        }
    }//GEN-LAST:event_removeButtonActionPerformed


    private void ListaContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaContatosActionPerformed


    }//GEN-LAST:event_ListaContatosActionPerformed

    private void ListaContatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListaContatosAncestorAdded

    }//GEN-LAST:event_ListaContatosAncestorAdded


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        IR.showRecords();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda_app().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgFundo;
    private javax.swing.JComboBox<String> ListaContatos;
    private javax.swing.JButton addButon;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField telefoneField;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables
}
