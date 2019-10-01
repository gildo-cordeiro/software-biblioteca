/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gildo
 */
public class Deletar extends ConexaoBD{
    public void DeleteProduto(int id){
        String sql = "delete from emprestimos where idEmprestimos=?";
        PreparedStatement estado=null;

        ConexaoDriver();

        try {
            estado=conectar.prepareStatement(sql);
            estado.setInt(1, id);
            estado.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao deletar","error", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
