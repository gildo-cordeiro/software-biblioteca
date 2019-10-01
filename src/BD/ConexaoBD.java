package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ConexaoBD {
     
    private String driver="com.mysql.jdbc.Driver";
    private String banco="biblioteca";
    private String host="localhost";
    private String str_con="jdbc:mysql://"+host+":3306/"+banco;
    private String usuario="root";
    private String Senha="";
    Connection conectar;
    
    public void ConexaoDriver(){
        try {
            Class.forName(driver);
            conectar= DriverManager.getConnection(str_con,usuario,Senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
        }
    }
    public void FecharConexao(){
        try {
            conectar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão");
        }
    
    }
}
